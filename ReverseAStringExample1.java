package com.AllPossibileProblems;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReverseAStringExample1 {

	public static void main(String[] args) throws IOException {
		
		
		// Reverse string using String.getbyte() method
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		System.out.println("Enter a string which you want to reverse ");
        
		String ReverseString = " ";
		
		String str1 = br.readLine();
		
		for(byte c : str1.getBytes()) {
		
			ReverseString = (char)c + ReverseString;
        }
		
		System.out.println("Original String :" +str1);
		System.out.println("Reversed String :" +ReverseString );
		
	}

}
