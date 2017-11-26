package com.interpreter.AST;
import com.interpreter.modules.Writer;
import java.util.ArrayList;
import java.util.List;

public class AbstractSyntaxTree {
    /**
     * Children is ordered left to right
     */
    protected List<AbstractSyntaxTree> children;
    protected AbstractSyntaxTree parent;
    protected NodeType nodeType;
    protected Object value;
    protected boolean isBreakpoint;
    
    public AbstractSyntaxTree(AbstractSyntaxTree parent) {
        this.parent = parent;
        this.children = new ArrayList<AbstractSyntaxTree>();
        this.isBreakpoint = false;
    }

    public void print() {
        print("", true);
    }

    private void print(String prefix, boolean isTail) {

        if(nodeType == NodeType.VARIABLE){
            System.out.println(prefix + (isTail ? "--------- " : "--------- ") + "VAR :"+ ((LeafNode)this).getLiteralType()+ " "+ this.getValue());
        }
        else if(nodeType == NodeType.LITERAL){
            System.out.println(prefix + (isTail ? "--------- " : "--------- ") + "LIT :"+ ((LeafNode)this).getLiteralType()+ " "+ this.getValue());
        }
        else
            System.out.println(prefix + (isTail ? "--------- " : "--------- ") + nodeType +"| val: "+value);
        for (int i = 0; i < children.size() - 1; i++) {
            children.get(i).print(prefix + (isTail ? "    " : "|”‚   "), false);
        }
        if (children.size() > 0) {
            children.get(children.size() - 1)
                    .print(prefix + (isTail ? "    " : "|”‚   "), true);

        }
    }

    public List<AbstractSyntaxTree> getChildren() {
        return children;
    }

    public AbstractSyntaxTree getChild(int index) {
        return children.get(index);
    }

    public void addChild(AbstractSyntaxTree child) {
        this.children.add(child);
    }
    
    public boolean hasChildren() {
    	return this.children != null && !this.children.isEmpty();
    }

    public AbstractSyntaxTree getParent() {
        return parent;
    }

    public void setParent(AbstractSyntaxTree parent) {
        this.parent = parent;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public NodeType getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeType nodeType) {
        this.nodeType = nodeType;
    }

    public Object evaluate() {
        switch(getNodeType()) {
            case FUNCTION_DECLARATION:break;
            case FUNCTION_INVOKE:break;
            case RETURN:break;
            case BIN_ARITHMETIC:
//                if(value.equals("+"))
//                    return ExpressionEvaluator.add(children.get(0).evaluate(),children.get(1).evaluate());
                    break;
            case BIN_LOGIC: break;
            case ASSIGN:break;
            case UNIPOST_ARITHMETIC: break;
            case UNIPRE_ARITHMETIC: break;
            case UNI_LOGIC:break;
            case WHILE:break;
            case DO_WHILE:break;
            case FOR:break;
            case TERMINAL:break;
            case BRANCH:break; //used for if-else statements
            case PRINT: Writer.printText(getValue().toString());break;
            case SCAN:break;
            default:break;
        }
		return null;
    }

	public boolean isBreakpoint() {
		return isBreakpoint;
	}

	public void setBreakpoint(boolean isBreakpoint) {
		this.isBreakpoint = isBreakpoint;
	}
}
