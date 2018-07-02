

import java.util.*;

class vowelcheck{
	public static void main (String[] args) {
	     Scanner sc=new Scanner(System.in);
	     int i,v=0,count=0,j;
	     int n=sc.nextInt();
	     String s[]=new String[n];
	     for(i=0;i<n;i++)
	     {
	         s[i]=sc.next();
	         int l=s[i].length();
	         
	         for(j=0;j<l;j++)
	         {
	             
	             if(s[i].charAt(j)=='a'||s[i].charAt(j)=='e'||s[i].charAt(j)=='i'||s[i].charAt(j)<='o'||s[i].charAt(j)<='u'||s[i].charAt(j)=='A'||s[i].charAt(j)=='E'||s[i].charAt(j)=='I'||s[i].charAt(j)=='O'||s[i].charAt(j)=='U')
	             {
	                 count++;
	                 
	             }
	             if(count>1)
	             {
	                 v++;
	                 
	                 break;
	             }
	         }
	         
	     }
	   if(v==n)  
	   {
	       System.out.print("yes"); 
	   }
	   else{
	        System.out.print("no");
	   }
   
    
}
}
