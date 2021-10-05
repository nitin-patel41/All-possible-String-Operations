package com.AllPossibileProblems;
import java.io.*;
import java.util.*;

public class ConvertNumberToString {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
	    int n = Integer.parseInt(br.readLine());
	    
	    if(n<0 || n>999)
	    {
	    	System.out.println("Wrong Input");
	    }
	    
	    else 
	    {
	    	int u = n%10;
	    	int tt = n/10;
	    	int t = tt%10;
	    	int h = n/100;
	    	String OneToNine[] = {" ", "One", "Two",   "Three", "Four","Five", "Six", "Seven", "Eight", "Nine","Ten","Eleven", "Twelve",
	                "Thirteen","Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"  };
	    	String TenToNinety[] = {" ","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy", "Sighty", "Ninety"};
	    	
	    	String hw = "Hundred";
	    	
	    	if(n<20)
	    		System.out.println(OneToNine[n]);
	    	else if(n<100)
	    		System.out.println(TenToNinety[t]+" "+OneToNine[u]);
	        else
	        	System.out.println(OneToNine[h]+" "+hw+" "+TenToNinety[t]+" "+OneToNine[u]);
                    
         }

	}

}
