package com.AllPossibileProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.*;

public class PrintCurrespondingCharcterOfTheGivenInteger {
	
      static int d,rev,s,g,my;
	
	public static void main(String[] args)throws IOException {
		 
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		  int x = Integer.parseInt(br.readLine());
		      while(x!=0) {
		     
		    	 d = x%10;
		    	 rev = rev*10+d;
		    	 x = x/10;                                                             
		    }
		      
		      int g = rev;
			     while(g!=-1)
			     {
			    	 s = g%10;
			    	  if(s==0)System.out.print("zero"+" ");
			    	 else if(s==1)System.out.print("One"+" ");
			    	 else if(s==2)System.out.print("Two"+" ");
			    	     else if(s==3)System.out.print("Three"+" ");
			    	       else if(s==4)System.out.print("Four"+" ");
			    	        else if(s==5)System.out.print("Five"+" ");
			    	          else if(s==6)System.out.print("Six"+" ");
			    	            else if(s==7)System.out.print("Seven"+" ");
			    	               else if(s==8)System.out.print("Eight"+" ");
			    	                  else if(s==9)System.out.print("Nine"+" ");
			    	 g = g/10;
			    	 
			     }
		     
		    
		     
	      }
	 }


