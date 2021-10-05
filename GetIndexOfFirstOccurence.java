package com.AllPossibileProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class GetIndexOfFirstOccurence {

	public static void main(String[] args)throws IOException {
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		System.out.println("Enter first String");
		String str1 = br.readLine();
		
		System.out.println("Enter Second  String");
		String str2 = br.readLine();
		
		int Result = str1.indexOf(str2);
		  
		System.out.print(Result);
		

	}

}
