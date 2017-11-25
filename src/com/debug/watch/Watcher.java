package com.debug.watch;

import java.util.ArrayList;

public class Watcher {
	
	private ArrayList<VariableNode> varList;
	
	public Watcher() {
		this.varList = new ArrayList<VariableNode>();
	}
	
	public ArrayList<VariableNode> getVarList() {
		return this.varList;
	}
	
	//TODO: Fix line number
	public void generateVarList(String inputCode) {
		String funcName = "";
		String funcBlock = "-";
		int lineNumber = 1;
		String dataType = "";
		String literal = "";
		
		int i = 0;
		while (i < inputCode.length()) {
			//ACT
			if(inputCode.charAt(i) == 'A') {
				if(i+1 < inputCode.length() && inputCode.charAt(i+1) == 'C') {
					if(i+2 < inputCode.length() && inputCode.charAt(i+2) == 'T') {
						if(i+3 < inputCode.length() && inputCode.charAt(i+3) == ' ') {
							i+=4;
							funcName = "";
							
							while(i < inputCode.length() && inputCode.charAt(i) != ' ') {
								 funcName += inputCode.charAt(i);
								 i++;
							}
						}
					}
				}
			}
			
			//int
			if(inputCode.charAt(i) == 'i') {
				if(i+1 < inputCode.length() && inputCode.charAt(i+1) == 'n') {
					if(i+2 < inputCode.length() && inputCode.charAt(i+2) == 't') {
						if(i+3 < inputCode.length() && inputCode.charAt(i+3) == ' ') {
							i+=4;
							dataType = "int";
							
							while(i < inputCode.length() && (inputCode.charAt(i) != ';' && inputCode.charAt(i) != '=' && inputCode.charAt(i) != ' ')) {
								literal += inputCode.charAt(i);
								i++;
							}
							
							VariableNode var = new VariableNode(lineNumber, dataType, literal, funcName, funcBlock);
							this.varList.add(var);
							literal = "";
						}
					}
				}
			}
			
			//float
			if(inputCode.charAt(i) == 'f') {
				if(i+1 < inputCode.length() && inputCode.charAt(i+1) == 'l') {
					if(i+2 < inputCode.length() && inputCode.charAt(i+2) == 'o') {
						if(i+3 < inputCode.length() && inputCode.charAt(i+3) == 'a') {
							if(i+4 < inputCode.length() && inputCode.charAt(i+4) == 't') {
								if(i+5 < inputCode.length() && inputCode.charAt(i+5) == ' ') {
									i+=6;
									dataType = "float";
									
									while(i < inputCode.length() && (inputCode.charAt(i) != ';' && inputCode.charAt(i) != '=' && inputCode.charAt(i) != ' ')) {
										literal += inputCode.charAt(i);
										i++;
									}
									
									VariableNode var = new VariableNode(lineNumber, dataType, literal, funcName, funcBlock);
									this.varList.add(var);
									
									literal = "";
								}
							}
						}
					}
				}
			}
			
			//double
			if(inputCode.charAt(i) == 'd') {
				if(i+1 < inputCode.length() && inputCode.charAt(i+1) == 'o') {
					if(i+2 < inputCode.length() && inputCode.charAt(i+2) == 'u') {
						if(i+3 < inputCode.length() && inputCode.charAt(i+3) == 'b') {
							if(i+4 < inputCode.length() && inputCode.charAt(i+4) == 'l') {
								if(i+5 < inputCode.length() && inputCode.charAt(i+5) == 'e') {
									if(i+6 < inputCode.length() && inputCode.charAt(i+6) == ' ') {
										i+=7;
										dataType = "double";
										
										while(i < inputCode.length() && (inputCode.charAt(i) != ';' && inputCode.charAt(i) != '=' && inputCode.charAt(i) != ' ')) {
											literal += inputCode.charAt(i);
											i++;
										}
										
										VariableNode var = new VariableNode(lineNumber, dataType, literal, funcName, funcBlock);
										this.varList.add(var);
										
										literal = "";
									}
								}
							}
						}
					}
				}
			}
			
			//short
			if(inputCode.charAt(i) == 's') {
				if(i+1 < inputCode.length() && inputCode.charAt(i+1) == 'h') {
					if(i+2 < inputCode.length() && inputCode.charAt(i+2) == 'o') {
						if(i+3 < inputCode.length() && inputCode.charAt(i+3) == 'r') {
							if(i+4 < inputCode.length() && inputCode.charAt(i+4) == 't') {
								if(i+5 < inputCode.length() && inputCode.charAt(i+5) == ' ') {
									i+=6;
									dataType = "short";
									
									while(i < inputCode.length() && (inputCode.charAt(i) != ';' && inputCode.charAt(i) != '=' && inputCode.charAt(i) != ' ')) {
										literal += inputCode.charAt(i);
										i++;
									}
									
									VariableNode var = new VariableNode(lineNumber, dataType, literal, funcName, funcBlock);
									this.varList.add(var);
									
									literal = "";
								}
							}
						}
					}
				}
			}
			
			//long
			if(inputCode.charAt(i) == 'l') {
				if(i+1 < inputCode.length() && inputCode.charAt(i+1) == 'o') {
					if(i+2 < inputCode.length() && inputCode.charAt(i+2) == 'n') {
						if(i+3 < inputCode.length() && inputCode.charAt(i+3) == 'g') {
							if(i+4 < inputCode.length() && inputCode.charAt(i+4) == ' ') {
								i+=5;
								dataType = "long";
								
								while(i < inputCode.length() && (inputCode.charAt(i) != ';' && inputCode.charAt(i) != '=' && inputCode.charAt(i) != ' ')) {
									literal += inputCode.charAt(i);
									i++;
								}
								
								VariableNode var = new VariableNode(lineNumber, dataType, literal, funcName, funcBlock);
								this.varList.add(var);
								
								literal = "";
							}
						}
					}
				}
			}
			
			//boolean
			if(inputCode.charAt(i) == 'b') {
				if(i+1 < inputCode.length() && inputCode.charAt(i+1) == 'o') {
					if(i+2 < inputCode.length() && inputCode.charAt(i+2) == 'o') {
						if(i+3 < inputCode.length() && inputCode.charAt(i+3) == 'l') {
							if(i+4 < inputCode.length() && inputCode.charAt(i+4) == 'e') {
								if(i+5 < inputCode.length() && inputCode.charAt(i+5) == 'a') {
									if(i+6 < inputCode.length() && inputCode.charAt(i+6) == 'n') {
										if(i+7 < inputCode.length() && inputCode.charAt(i+7) == ' ') {
											i+=8;
											dataType = "boolean";
											
											while(i < inputCode.length() && (inputCode.charAt(i) != ';' && inputCode.charAt(i) != '=' && inputCode.charAt(i) != ' ')) {
												literal += inputCode.charAt(i);
												i++;
											}
											
											VariableNode var = new VariableNode(lineNumber, dataType, literal, funcName, funcBlock);
											this.varList.add(var);
											
											literal = "";
										}
									}
								}
							}
						}
					}
				}
			}
			
			//char
			if(inputCode.charAt(i) == 'c') {
				if(i+1 < inputCode.length() && inputCode.charAt(i+1) == 'h') {
					if(i+2 < inputCode.length() && inputCode.charAt(i+2) == 'a') {
						if(i+3 < inputCode.length() && inputCode.charAt(i+3) == 'r') {
							if(i+4 < inputCode.length() && inputCode.charAt(i+4) == ' ') {
								i+=5;
								dataType = "char";
								
								while(i < inputCode.length() && (inputCode.charAt(i) != ';' && inputCode.charAt(i) != '=' && inputCode.charAt(i) != ' ')) {
									literal += inputCode.charAt(i);
									i++;
								}
								
								VariableNode var = new VariableNode(lineNumber, dataType, literal, funcName, funcBlock);
								this.varList.add(var);
								
								literal = "";
							}
						}
					}
				}
			}
			
			//String
			if(inputCode.charAt(i) == 'S') {
				if(i+1 < inputCode.length() && inputCode.charAt(i+1) == 't') {
					if(i+2 < inputCode.length() && inputCode.charAt(i+2) == 'r') {
						if(i+3 < inputCode.length() && inputCode.charAt(i+3) == 'i') {
							if(i+4 < inputCode.length() && inputCode.charAt(i+4) == 'n') {
								if(i+5 < inputCode.length() && inputCode.charAt(i+5) == 'g') {
									if(i+6 < inputCode.length() && inputCode.charAt(i+6) == ' ') {
										i+=7;
										dataType = "String";
										
										while(i < inputCode.length() && (inputCode.charAt(i) != ';' && inputCode.charAt(i) != '=' && inputCode.charAt(i) != ' ')) {
											literal += inputCode.charAt(i);
											i++;
										}
										
										VariableNode var = new VariableNode(lineNumber, dataType, literal, funcName, funcBlock);
										this.varList.add(var);
										
										literal = "";
									}
								}
							}
						}
					}
				}
			}
			
			//next line
			if(inputCode.charAt(i) == '\n') {
				lineNumber++;
				i++;
			}
			
			i++;
		}
	}
	
}
