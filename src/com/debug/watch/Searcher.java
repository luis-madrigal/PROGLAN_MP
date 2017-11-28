package com.debug.watch;

import java.util.ArrayList;
import java.util.Stack;

public class Searcher {
	
	private ArrayList<VariableNode> varList;
	private Stack<String> blocks;
	private ArrayList<Integer> counter;
	private String count;
	
	private int depth;
	private boolean shouldAdd;
		
	public Searcher() {
		this.varList = new ArrayList<VariableNode>();
		this.blocks = new Stack<String>();
		this.count = "";
		this.counter = new ArrayList<Integer>();
		
		this.depth = -1;
		this.shouldAdd = false;
	}
	
	public ArrayList<VariableNode> getVarList() {
		return this.varList;
	}
	
	public void generateVarList(String inputCode) {
		if(!this.varList.isEmpty())
			this.varList.clear();
		
		this.reset();
		int lineNumber = 0;
		String dataType = "";
		String literal = "";
		String funcName = "";
		String funcBlock = "-";
		
		String[] segmented = inputCode.split("\n");
		
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
			
			if(line.contains("rehearse {") || line.contains("rehearse{")) {
				funcBlock = "rehearse-when";
				
				if(!this.blocks.isEmpty() && !this.counter.isEmpty()) {
					if(this.blocks.peek().equals("MULTIPLE") && this.counter.size()*2 > this.blocks.size()) {
						int counterSize = this.counter.size()*2;
						
						this.shouldAdd = false;
						
						if(counterSize-this.blocks.size() > 2) {
							int diff = counterSize-this.blocks.size();
							diff /= 2;
							diff -= 1;
							int oldDepth = this.depth;
							this.depth = oldDepth - diff;
							
							int lastIndex = this.counter.size()-1;
							for(int i = 1; i <= diff; i++) {
								this.counter.remove(lastIndex);
								lastIndex--;
							}
						}
					}
					else if(this.blocks.peek().equals("MULTIPLE") && this.counter.size()*2 == this.blocks.size()) {
						this.shouldAdd = true;
					}
				}
				
				if(this.blocks.isEmpty()) {
					this.depth = 0;
					
					if(!this.counter.isEmpty()) {
						int prevVal = this.counter.get(this.depth);
						this.counter.set(this.depth, prevVal+1);
						
						int n = this.counter.size()-1;
						int lastIndex = n;
						for(int i = 0; i < n; i++) {
							this.counter.remove(lastIndex);
							lastIndex--;
						}
					}
					else {
						this.counter.add(0);
					}
				}
				else {
					if(this.shouldAdd) {
						this.depth++;
						this.counter.add(0);
					}
					else {
						int prevVal = this.counter.get(this.depth);
						this.counter.set(this.depth, prevVal+1);
					}
				}
				
				this.blocks.push("DOWHILE");
				this.blocks.push("MULTIPLE");
				System.out.println("Pushed DoWhile & Multiple.");
			}
			
			if(line.contains("when(") || line.contains("when (")) {
				System.out.println("Enter When.");
				System.out.println("Block Size: "+this.blocks.size());
				if(!line.contains(";")) {
					System.out.println("Loop While1.");
					funcBlock = "when";
					
					if(!this.blocks.isEmpty() && !this.counter.isEmpty()) {
						if(this.blocks.peek().equals("MULTIPLE") && this.counter.size()*2 > this.blocks.size()) {
							int counterSize = this.counter.size()*2;
							
							this.shouldAdd = false;
							
							if(counterSize-this.blocks.size() > 2) {
								int diff = counterSize-this.blocks.size();
								diff /= 2;
								diff -= 1;
								int oldDepth = this.depth;
								this.depth = oldDepth - diff;
								
								int lastIndex = this.counter.size()-1;
								for(int i = 1; i <= diff; i++) {
									this.counter.remove(lastIndex);
									lastIndex--;
								}
							}
						}
						else if(this.blocks.peek().equals("MULTIPLE") && this.counter.size()*2 == this.blocks.size()) {
							this.shouldAdd = true;
						}
					}
					
					if(this.blocks.isEmpty()) {
						this.depth = 0;
						
						if(!this.counter.isEmpty()) {
							int prevVal = this.counter.get(this.depth);
							this.counter.set(this.depth, prevVal+1);
							
							int n = this.counter.size()-1;
							int lastIndex = n;
							for(int i = 0; i < n; i++) {
								this.counter.remove(lastIndex);
								lastIndex--;
							}
							
						}
						else {
							this.counter.add(0);
						}
					}
					else {
						if(this.shouldAdd) {
							this.depth++;
							this.counter.add(0);
						}
						else {
							int prevVal = this.counter.get(this.depth);
							this.counter.set(this.depth, prevVal+1);
						}
					}
					
					this.blocks.push("WHILE");
					if(line.contains("{")) {
						this.blocks.push("MULTIPLE");
						System.out.println("Pushed While & Multiple.");
					}
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
				
				if(!this.blocks.isEmpty() && !this.counter.isEmpty()) {
					if(this.blocks.peek().equals("MULTIPLE") && this.counter.size()*2 > this.blocks.size()) {
						int counterSize = this.counter.size()*2;
						
						this.shouldAdd = false;
						
						if(counterSize-this.blocks.size() > 2) {
							int diff = counterSize-this.blocks.size();
							diff /= 2;
							diff -= 1;
							int oldDepth = this.depth;
							this.depth = oldDepth - diff;
							
							int lastIndex = this.counter.size()-1;
							for(int i = 1; i <= diff; i++) {
								this.counter.remove(lastIndex);
								lastIndex--;
							}
						}
					}
					else if(this.blocks.peek().equals("MULTIPLE") && this.counter.size()*2 == this.blocks.size()) {
						this.shouldAdd = true;
					}
				}
				
				if(this.blocks.isEmpty()) {
					this.depth = 0;
					
					if(!this.counter.isEmpty()) {
						int prevVal = this.counter.get(this.depth);
						this.counter.set(this.depth, prevVal+1);
						
						int n = this.counter.size()-1;
						int lastIndex = n;
						for(int i = 0; i < n; i++) {
							this.counter.remove(lastIndex);
							lastIndex--;
						}
					}
					else
						this.counter.add(0);
				}
				else {
					if(this.shouldAdd) {
						this.depth++;
						this.counter.add(0);
					}
					else {
						int prevVal = this.counter.get(this.depth);
						this.counter.set(this.depth, prevVal+1);
					}
				}
				
				this.blocks.push("FOR");
				if(line.contains("{")) {
					this.blocks.push("MULTIPLE");
				}
			}
			
			if(line.contains("if (") || line.contains("if(")) {
				funcBlock = "if";
				
				if(!this.blocks.isEmpty() && !this.counter.isEmpty()) {
					if(this.blocks.peek().equals("MULTIPLE") && this.counter.size()*2 > this.blocks.size()) {
						int counterSize = this.counter.size()*2;
						
						this.shouldAdd = false;
						
						if(counterSize-this.blocks.size() > 2) {
							int diff = counterSize-this.blocks.size();
							diff /= 2;
							diff -= 1;
							int oldDepth = this.depth;
							this.depth = oldDepth - diff;
							
							int lastIndex = this.counter.size()-1;
							for(int i = 1; i <= diff; i++) {
								this.counter.remove(lastIndex);
								lastIndex--;
							}
						}
					}
					else if(this.blocks.peek().equals("MULTIPLE") && this.counter.size()*2 == this.blocks.size()) {
						this.shouldAdd = true;
					}
				}
				
				if(this.blocks.isEmpty()) {
					this.depth = 0;
					
					if(!this.counter.isEmpty()) {
						int prevVal = this.counter.get(this.depth);
						this.counter.set(this.depth, prevVal+1);
						
						int n = this.counter.size()-1;
						int lastIndex = n;
						for(int i = 0; i < n; i++) {
							this.counter.remove(lastIndex);
							lastIndex--;
						}
					}
					else
						this.counter.add(0);
				}
				else {
					if(this.shouldAdd) {
						this.depth++;
						this.counter.add(0);
					}
					else {
						int prevVal = this.counter.get(this.depth);
						this.counter.set(this.depth, prevVal+1);
					}
				}
				
				this.blocks.push("IF");
				if(line.contains("{")) {
					this.blocks.push("MULTIPLE");
				}
			}
			
			if(line.contains("int") || line.contains("float") || line.contains("double") || line.contains("boolean") ||
					line.contains("long") || line.contains("short") || line.contains("String") || line.contains("char")) {
				
				int index = 0;
				
				if(line.contains("int")) {
					index = line.indexOf("int")+2;

					if(index+1 < line.length() && line.charAt(index+1) == ' ') {
						index+=2;
						dataType = "int";

						if(index+2 < line.length() && line.charAt(index+2) == '[') {
							index+=5;
							dataType = "int []";
						}
					}
					else if(index+1 < line.length() && line.charAt(index+1) == '[') {
						index+=4;
						dataType = "int []";
					}
					else
						index = 0;
				}
				else if(line.contains("float")) {
					index = line.indexOf("float")+4;
					
					if(index+1 < line.length() && line.charAt(index+1) == ' ') {
						index+=2;
						dataType = "float";
						
						if(index+2 < line.length() && line.charAt(index+2) == '[') {
							index+=5;
							dataType = "float []";
						}
					}
					else if(index+1 < line.length() && line.charAt(index+1) == '[') {
						index+=4;
						dataType = "float []";
					}
					else
						index = 0;
				}
				else if(line.contains("double")) {
					index = line.indexOf("double")+5;
					
					if(index+1 < line.length() && line.charAt(index+1) == ' ') {
						index+=2;
						dataType = "double";
						
						if(index+2 < line.length() && line.charAt(index+2) == '[') {
							index+=5;
							dataType = "double []";
						}
					}
					else if(index+1 < line.length() && line.charAt(index+1) == '[') {
						index+=4;
						dataType = "double []";
					}
					else
						index = 0;
				}
				else if(line.contains("boolean")) {
					index = line.indexOf("boolean")+6;
					
					if(index+1 < line.length() && line.charAt(index+1) == ' ') {
						index+=2;
						dataType = "boolean";
						
						if(index+2 < line.length() && line.charAt(index+2) == '[') {
							index+=5;
							dataType = "boolean []";
						}
					}
					else if(index+1 < line.length() && line.charAt(index+1) == '[') {
						index+=4;
						dataType = "boolean []";
					}
					else
						index = 0;
				}
				else if(line.contains("long")) {
					index = line.indexOf("long")+3;
					
					if(index+1 < line.length() && line.charAt(index+1) == ' ') {
						index+=2;
						dataType = "long";
						
						if(index+2 < line.length() && line.charAt(index+2) == '[') {
							index+=5;
							dataType = "long []";
						}
					}
					else if(index+1 < line.length() && line.charAt(index+1) == '[') {
						index+=4;
						dataType = "long []";
					}
					else
						index = 0;
				}
				else if(line.contains("short")) {
					index = line.indexOf("short")+4;
					
					if(index+1 < line.length() && line.charAt(index+1) == ' ') {
						index+=2;
						dataType = "short";
						
						if(index+2 < line.length() && line.charAt(index+2) == '[') {
							index+=5;
							dataType = "short []";
						}
					}
					else if(index+1 < line.length() && line.charAt(index+1) == '[') {
						index+=4;
						dataType = "short []";
					}
					else
						index = 0;
				}
				else if(line.contains("String")) {
					index = line.indexOf("String")+5;
					
					if(index+1 < line.length() && line.charAt(index+1) == ' ') {
						index+=2;
						dataType = "String";
						
						if(index+2 < line.length() && line.charAt(index+2) == '[') {
							index+=5;
							dataType = "String []";
						}
					}
					else if(index+1 < line.length() && line.charAt(index+1) == '[') {
						index+=4;
						dataType = "String []";
					}
					else
						index = 0;
				}
				else if(line.contains("char")) {
					index = line.indexOf("char")+3;
					
					if(index+1 < line.length() && line.charAt(index+1) == ' ') {
						index+=2;
						dataType = "char";
						
						if(index+2 < line.length() && line.charAt(index+2) == '[') {
							index+=5;
							dataType = "char []";
						}
					}
					else if(index+1 < line.length() && line.charAt(index+1) == '[') {
						index+=4;
						dataType = "char []";
					}
					else
						index = 0;
				}
				
				if(index != 0) {
					
					if(!this.blocks.isEmpty() && !this.counter.isEmpty()) {
						if(this.blocks.peek().equals("MULTIPLE") && this.counter.size()*2 > this.blocks.size()) {
							int counterSize = this.counter.size()*2;
							
							this.shouldAdd = false;
							
							if(counterSize-this.blocks.size() > 2) {
								int diff = counterSize-this.blocks.size();
								diff /= 2;
								diff -= 1;
								int oldDepth = this.depth;
								this.depth = oldDepth - diff;
								
								int lastIndex = this.counter.size()-1;
								for(int i = 1; i <= diff; i++) {
									this.counter.remove(lastIndex);
									lastIndex--;
								}
							}
						}
						else if(this.blocks.peek().equals("MULTIPLE") && this.counter.size()*2 == this.blocks.size()) {
							this.shouldAdd = true;
						}
					}
					
					if(this.blocks.isEmpty()) {
						System.out.println("Empty blocks.");
						this.depth = 0;
						
						if(!this.counter.isEmpty()) {
							int prevVal = this.counter.get(this.depth);
							this.counter.set(this.depth, prevVal+1);
							
							int n = this.counter.size()-1;
							int lastIndex = n;
							for(int i = 0; i < n; i++) {
								this.counter.remove(lastIndex);
								lastIndex--;
							}
						}
						else
							this.counter.add(0);
					}
					else {
						if(this.shouldAdd) {
							System.out.println("Enter should add (var)");
							this.depth++;
							this.counter.add(0);
						}
						else {
							int prevVal = this.counter.get(this.depth);
							System.out.println("Prev Val: "+prevVal);
							this.counter.set(this.depth, prevVal+1);
						}
					}
					
					while(index < line.length() && (line.charAt(index) != ';' && line.charAt(index) != '=' && line.charAt(index) != ' ')) {
						literal += line.charAt(index);
						
						if(index+1 < line.length() && line.charAt(index+1) == ',') {
							count = "";
							for(int n : this.counter) {
								count += n+"-";
							}
							
							VariableNode var = new VariableNode(lineNumber, dataType, literal, funcName, funcBlock, count);
							this.varList.add(var);
							literal = "";
							
							if(!this.blocks.isEmpty() && this.blocks.peek().equals("SINGLE")) {
								this.blocks.pop();
								this.blocks.pop();
								
								if(!this.blocks.isEmpty()) {
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
					
					count = "";
					for(int n : this.counter) {
						count += n+"-";
					}
					
					
					VariableNode var = new VariableNode(lineNumber, dataType, literal, funcName, funcBlock, count);
					this.varList.add(var);
					literal = "";
					
					if(!this.blocks.isEmpty() && this.blocks.peek().equals("SINGLE")) {
						this.blocks.pop();
						this.blocks.pop();
						
						if(!this.blocks.isEmpty()) {
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
	
	public void reset() {
		this.varList = new ArrayList<VariableNode>();
		this.blocks = new Stack<String>();
		this.count = "";
		this.counter = new ArrayList<Integer>();
		
		this.depth = -1;
		this.shouldAdd = false;
	}
	
}
