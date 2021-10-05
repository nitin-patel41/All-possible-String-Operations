package com.AllPossibileProblems;

import java.io.*;


public class CheckToStringAreEqual {

	public static void main(String[] args)throws IOException  {
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		System.out.println("Enter first String");
		String str1 = br.readLine();
		
		System.out.println("Enter Second  String");
		String str2 = br.readLine();
		
		boolean Result = str1.equals(str2);
		  
		System.out.print(Result);
		

	}

}
