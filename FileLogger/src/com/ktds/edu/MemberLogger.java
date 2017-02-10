package com.ktds.edu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MemberLogger extends Logger {

	@Override
	public void writeMessage(PrintWriter out, String message) throws IOException {
		out.println(message);
	}


}
