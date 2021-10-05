package com.AllPossibileProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReplaceAllOccurenceInString {

	public static void main(String[] args)throws IOException {
 
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		System.out.println("Enter first String");
		String str1 = br.readLine();
		
		System.out.println("Enter a string which you want to replace in the place of above String");
		String old_string = br.readLine();
		
		System.out.println("Enter new String");
		String new_string  = br.readLine();
		
		String Result = str1.replaceAll(old_string , new_string);
		  
		System.out.print(Result);
		
		
		/* note if the given string is not matched in the first string then the first string return as it is */
		

	}

}
