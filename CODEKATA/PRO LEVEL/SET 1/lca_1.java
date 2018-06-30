/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class LCP {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,j,count=0,k;
	int n=sc.nextInt();
	char c;
	String x="";
	String[] s=new String[n];
	int max=0;
	for(i=0;i<n;i++)
	{
	    s[i]=sc.next();
	    int l=s[i].length();
	    if(max<l)
	    {
	        max=l;
	    }
	}
	for(i=0;i<n;i++)
	{
	for(j=0;j<max;j++)
	{
	    int l1=s[i].length();
	   if(l1==max)
	   {
	       break;
	   }
	   s[i]+=0; 
	   
	}
	}

for(i=0;i<n;i++)
{
    for(j=0;j<max;j++)
    {
        count=0;
    c=s[i].charAt(j);
    
    if(c!='0')
    {
   for(k=i+1;k<n;k++)
   {
       if(c==s[k].charAt(j))
       {
           count++;
       }
       if(count==n-1)
       {
           x+=c;
       }
   }
    }
    }
}
System.out.print(x);
}
}
    
