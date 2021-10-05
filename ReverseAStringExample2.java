package com.AllPossibileProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReverseAStringExample2 {

	public static void main(String[] args)throws IOException {
	
		// Reverse String Using String.charAt() Method
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		System.out.println("Enter a string which you want to reverse ");
        
		String ReverseString = " ";
		
		String str1 = br.readLine();
		
		for( int i = 0; i<str1.length();i++) {
		
			ReverseString = str1.charAt(i)+ ReverseString;
        }
		
		System.out.println("Original String :" +str1);
		System.out.println("Reversed String :" +ReverseString );
		

	}

}
