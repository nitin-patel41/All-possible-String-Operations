package com.AllPossibileProblems;
import java.io.*;

public class ConcatenateTwoString {

	public static void main(String[] args) throws IOException  {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		System.out.println("Enter first String");
		String str1 = br.readLine();
		
		System.out.println("Enter Secod  String");
		String str2 = br.readLine();
		
		String Result = str1 +" "+ str2; // Putting dubble quotes for space between str1 and str2
		
		System.out.printf(" Concatenate Strings : "  +Result);
		}

}
