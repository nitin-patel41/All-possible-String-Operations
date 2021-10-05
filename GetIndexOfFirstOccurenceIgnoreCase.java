package com.AllPossibileProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class GetIndexOfFirstOccurenceIgnoreCase {

	public static void main(String[] args)throws IOException  {
	
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		System.out.println("Enter first String");
		String str1 = br.readLine();
		
		System.out.println("Enter Second  String");
		String str2 = br.readLine();
		
		int Result = str1.toLowerCase().indexOf(str2.toLowerCase());
		  
		System.out.print("str2 First appeard in str1 at index :" +Result);
		

	}
}


