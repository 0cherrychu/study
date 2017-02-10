package com.ktds.edu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class Logger {
	
	public void log(String message) {
		File loggerFile = makeAndOpenFile();
		
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		PrintWriter out = null;
		
		try {
			fileWriter = new FileWriter(loggerFile, true);//이어쓸거면 true, 아니면 false
			bufferedWriter = new BufferedWriter(fileWriter);
			out = new PrintWriter(bufferedWriter);
			
			writeMessage(out, message);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				out.close();
				bufferedWriter.close();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	private File makeAndOpenFile() {
		File loggerFile = new File("D:/logger.log");
		if ( !loggerFile.exists() ){
			try {
				loggerFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();//에러 내용을 그대로 출력해라
			}
		}
		return loggerFile;
	}
	
	public abstract void writeMessage(PrintWriter out, String message) throws IOException;
}
