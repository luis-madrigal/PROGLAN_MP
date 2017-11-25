package com.debug.watch;

import java.util.ArrayList;
import java.util.Stack;

public class Watcher {
	
	private ArrayList<VariableNode> varList;
	private Stack<String> blocks;
	
	public Watcher() {
		this.varList = new ArrayList<VariableNode>();
		this.blocks = new Stack<String>();
	}
	
	public ArrayList<VariableNode> getVarList() {
		return this.varList;
	}
	
	public void generateVarList(String inputCode) {
		int lineNumber = 0;
		String dataType = "";
		String literal = "";
		String funcName = "";
		String funcBlock = "-";
		
		String[] segmented = inputCode.split("\n");
//		int i = 0;
		
		for(String line : segmented) {
			lineNumber++;
			
			if(line.contains("ACT ")) {
				int index = line.indexOf("ACT ") + 4;
				funcName = "";
				
				while(index < line.length() && line.charAt(index) != ' ') {
					funcName += line.charAt(index);
					index++;
				}
			}
			
			if(line.contains("rehearse")) {
				funcBlock = "rehearse-when";
				this.blocks.push("DOWHILE");
			}
			
			if(line.contains("when(") || line.contains("when (")) {
				if(!this.blocks.isEmpty() && this.blocks.peek().equals("DOWHILE") && line.contains(";")) {
					this.blocks.pop();
					
					if(!this.blocks.isEmpty()) {
						System.out.println("Peek: "+this.blocks.peek());
						boolean hasMultiple = false;
						
						if(this.blocks.peek().equals("MULTIPLE")) {
							this.blocks.pop();
							hasMultiple = true;
						}
						
						if(this.blocks.peek().equals("IF"))
							funcBlock = "if";
						else if(this.blocks.peek().equals("FOR"))
							funcBlock = "replay";
						else if(this.blocks.peek().equals("WHILE"))
							funcBlock = "when";
						else if(this.blocks.peek().equals("DOWHILE"))
							funcBlock = "rehearse-when";
						
						if(hasMultiple)
							this.blocks.push("MULTIPLE");
					}
					else
						funcBlock = "";
				}
				else {
					funcBlock = "when";
					this.blocks.push("WHILE");
					if(line.contains("{"))
						this.blocks.push("MULTIPLE");
				}
			}
			
			if(line.contains("{") && !this.blocks.isEmpty() &&
					(this.blocks.peek().equals("WHILE") || this.blocks.peek().equals("FOR") || this.blocks.peek().equals("IF"))) {
				this.blocks.push("MULTIPLE");
			}
			
			if(line.contains("}") && !this.blocks.isEmpty() && this.blocks.peek().equals("MULTIPLE")) {
				this.blocks.pop();
				this.blocks.pop();

				if(!this.blocks.isEmpty()) {
					System.out.println("Peek: "+this.blocks.peek());
					boolean hasMultiple = false;
					
					if(this.blocks.peek().equals("MULTIPLE")) {
						this.blocks.pop();
						hasMultiple = true;
					}
					
					if(this.blocks.peek().equals("IF"))
						funcBlock = "if";
					else if(this.blocks.peek().equals("FOR"))
						funcBlock = "replay";
					else if(this.blocks.peek().equals("WHILE"))
						funcBlock = "when";
					else if(this.blocks.peek().equals("DOWHILE"))
						funcBlock = "rehearse-when";
					
					if(hasMultiple)
						this.blocks.push("MULTIPLE");
				}
				else
					funcBlock = "";
			}
			
			if(!this.blocks.isEmpty() &&
					(this.blocks.peek().equals("WHILE") || this.blocks.peek().equals("FOR") || this.blocks.peek().equals("IF"))) {
				this.blocks.push("SINGLE");
			}
			
			if(line.contains("replay(") || line.contains("replay (")) {
				funcBlock = "replay";
				this.blocks.push("FOR");
				if(line.contains("{")) {
					this.blocks.push("MULTIPLE");
				}
			}
			
			if(line.contains("if (") || line.contains("if(")) {
				funcBlock = "if";
				this.blocks.push("IF");
				if(line.contains("{")) {
					this.blocks.push("MULTIPLE");
				}
			}
			
			if(line.contains("int ") || line.contains("float ") || line.contains("double ") || line.contains("boolean ") ||
					line.contains("long ") || line.contains("short ") || line.contains("String ") || line.contains("char ")) {
				
				int index = 0;
				
				if(line.contains("int ")) {
					index = line.indexOf("int ")+4;
					dataType = "int";
				}
				else if(line.contains("float ")) {
					index = line.indexOf("float ")+6;
					dataType = "float";
				}
				else if(line.contains("double ")) {
					index = line.indexOf("double ")+7;
					dataType = "double";
				}
				else if(line.contains("boolean ")) {
					index = line.indexOf("boolean ")+8;
					dataType = "boolean";
				}
				else if(line.contains("long ")) {
					index = line.indexOf("long ")+5;
					dataType = "long";
				}
				else if(line.contains("short ")) {
					index = line.indexOf("short ")+6;
					dataType = "short";
				}
				else if(line.contains("String ")) {
					index = line.indexOf("String ")+7;
					dataType = "String";
				}
				else if(line.contains("char ")) {
					index = line.indexOf("char ")+5;
					dataType = "char";
				}
				
				while(index < line.length() && (line.charAt(index) != ';' && line.charAt(index) != '=' && line.charAt(index) != ' ')) {
					literal += line.charAt(index);
					
					if(index+1 < line.length() && line.charAt(index+1) == ',') {
						VariableNode var = new VariableNode(lineNumber, dataType, literal, funcName, funcBlock);
						this.varList.add(var);
						literal = "";
						
						if(!this.blocks.isEmpty() && this.blocks.peek().equals("SINGLE")) {
							this.blocks.pop();
							this.blocks.pop();
							
							if(!this.blocks.isEmpty()) {
								System.out.println("Peek: "+this.blocks.peek());
								boolean hasMultiple = false;
								
								if(this.blocks.peek().equals("MULTIPLE")) {
									this.blocks.pop();
									hasMultiple = true;
								}
								
								if(this.blocks.peek().equals("IF"))
									funcBlock = "if";
								else if(this.blocks.peek().equals("FOR"))
									funcBlock = "replay";
								else if(this.blocks.peek().equals("WHILE"))
									funcBlock = "when";
								else if(this.blocks.peek().equals("DOWHILE"))
									funcBlock = "rehearse-when";
								
								if(hasMultiple)
									this.blocks.push("MULTIPLE");
							}
							else
								funcBlock = "";
						}
						
						if(index+2 < line.length() && line.charAt(index+2) == ' ')
							index += 3;
						else
							index += 2;
					}
					else
						index++; 
				}
				
				VariableNode var = new VariableNode(lineNumber, dataType, literal, funcName, funcBlock);
				this.varList.add(var);
				literal = "";
				
				if(!this.blocks.isEmpty() && this.blocks.peek().equals("SINGLE")) {
					this.blocks.pop();
					this.blocks.pop();
					
					if(!this.blocks.isEmpty()) {
						System.out.println("Peek: "+this.blocks.peek());
						boolean hasMultiple = false;
						
						if(this.blocks.peek().equals("MULTIPLE")) {
							this.blocks.pop();
							hasMultiple = true;
						}
						
						if(this.blocks.peek().equals("IF"))
							funcBlock = "if";
						else if(this.blocks.peek().equals("FOR"))
							funcBlock = "replay";
						else if(this.blocks.peek().equals("WHILE"))
							funcBlock = "when";
						else if(this.blocks.peek().equals("DOWHILE"))
							funcBlock = "rehearse-when";
						
						if(hasMultiple)
							this.blocks.push("MULTIPLE");
					}
					else
						funcBlock = "";
				}
			}
			
		}
	}
	
}
