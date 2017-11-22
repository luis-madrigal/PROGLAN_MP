package com.save;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileHandler {

	public void save(String filename, String strFile) {
		  FileWriter saveFile;
		try {
			saveFile = new FileWriter(filename+".txt");


		    // Write the data to the file.
		    saveFile.write("\n"); // Always insert a blank line
		    

		    saveFile.write(strFile);

		    saveFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void save(String strFile) {
		  FileWriter saveFile;
		try {
			saveFile = new FileWriter("autosave.txt");


		    // Write the data to the file.
		    saveFile.write("\n"); // Always insert a blank line
		    saveFile.write(strFile);

		    saveFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String load(String filename) {
		String strFile = "";
		String strLine;
	    BufferedReader loadFile;
		try {
			checkFile("autosave");
			loadFile = new BufferedReader(new FileReader(filename+".txt"));
			
			// Remove the blank line
		    loadFile.readLine(); 
		    
		    while((strLine = loadFile.readLine()) != null) {
		    	strFile += strLine;
		    	strFile += "\n";
		    }
		    
		    loadFile.close();
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    return strFile;
	}
	
	public void checkFile(String strFilename) {
		String strDir = System.getProperty("user.dir");
        File myFile = new File(strDir, strFilename + ".txt");
        if (!myFile.exists()) {

            try {
				myFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}	
        }   
	}
	
	public String load() {
		String strFile = "";
		String strLine;
	    BufferedReader loadFile;
		try {
			checkFile("autosave");
			loadFile = new BufferedReader(new FileReader("autosave.txt"));
			
			// Remove the blank line
		    loadFile.readLine(); 
		    
		    while((strLine = loadFile.readLine()) != null) {
		    	strFile += strLine;
		    	strFile += "\n";
		    }
		    
		    loadFile.close();
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    return strFile;
	}
}
