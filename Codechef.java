/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
	    Scanner sc=new Scanner(System.in);
	    int[] c=new int[30];int j=0;int f=0;
	    String s=sc.next();
	    int n=s.length();
	    int[] g=new int[n];
	    String s1=s.substring(0,1);
	    c[j]=j++;
	    //System.out.print(c);
	    String s2=s.substring(0,2);
	    //char[] c1=s2.toCharArray();
	    for(int i=0;i<s2.length()-1;i++){
	        if(s2.charAt(i)!=s2.charAt(i+1)){
	            c[j]=j++;
	            //System.out.print(c);
	        }
	        //else
	        //c=0;
	    }
	    String s3=s.substring(0,3);
	    //char[] c2=s3.toCharArray();
	    for(int i=0;i<s3.length()-1;i++){
	        if(s3.charAt(i)!=s3.charAt(i+1)){
	            c[j]=j++;
	            //System.out.print(c);
	        }
	        //else
	        //c=0;
	    }
	    String s4=s.substring(0,4);
	    //char[] c3=s4.toCharArray();
	    for(int i=0;i<s4.length()-1;i++){
	        if(s4.charAt(i)!=s4.charAt(i+1)){
	            c[j]=j++;
	        }
	        //else
	        //c=0;
	    }
	    String s5=s.substring(0,n-1);
	    //char[] c4=s5.toCharArray();
	    for(int i=0;i<s5.length()-1;i++){
	        if(s5.charAt(i)!=s5.charAt(i+1)){
	            c[j]=j++;
	            c[j]=4;
	        }
	    }
	    	       System.out.print(c[j]);

	    
	}
}
