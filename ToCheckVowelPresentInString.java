package com.AllPossibileProblems;
import java.io.*;


public class ToCheckVowelPresentInString {

	public static void main(String[] args)throws IOException  {
		
		// To chack if Vowel Is present in string
		
		int VCount=0,cCount=0;
	    
	    InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		String str = br.readLine();//input String 
		
		str = str.toLowerCase();//converting entire String into lower case to reduce the Comparisons
		
		for(int i=0; i<str.length();i++)
		{
		     //Check whether a charcter is vowel
			
		if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
		{
			VCount++; // Increment the Vowel Counter
		}
		//check whether a charcter is constant 
		else if (str.charAt(i) >= 'a' && str.charAt(i) < 'z')
		{
			//Increment the Constant Counter
			cCount++;
			
			/* If user Input is Integer print The 
			   corresponding Character 
			   
			   for example user Input Is :- 101
			        
			   then Corresponding Character is :- One zero One */
		}
			
		}
                
		 System.out.println("Numbers of Vowels : " + VCount);
		 System.out.println("Numbers of Consonants : " + cCount);
		 
	}

}
