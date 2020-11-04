import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t--!=0){
	     String s=sc.next();
	     String a[]=s.split(".");
	     StringBuffer se=new StringBuffer();
	     for(int i=0;i<a.length;i++)
	     {
	         
	         StringBuffer sb=new StringBuffer(a[i]);
	         if(i+1!=a.length)
	         {
	             String new1=sb.reverse()+"";
	             se.append(new1);
	             se.append(".");
	         }
	         else
	         {
	               String new1=sb.reverse()+"";
	             se.append(new1);
	             
	         }
	     }
	    
	   //  System.out.print(a[a.length-1]);
	     System.out.println(se);
	 }
	 }
	 
}