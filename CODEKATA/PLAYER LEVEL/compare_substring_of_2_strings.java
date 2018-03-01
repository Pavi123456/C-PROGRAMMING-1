/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String b=sc.nextLine();
	int i,j,count=0,c1=0;
	int l1=a.length();
	int l2=b.length();
	String s[]=new String[l1];
	int l3=l1-2;
	for(i=0;i<l3;i++)
	{
	    for(j=l2;j<=l1;j++)
	    {
	        s[i]=a.substring(i,j);
	        //System.out.println(s[i]);
	        i++;
	        count++;
	    }
	}
	
	for(i=0;i<count;i++)
	{
	    if(s[i].equals(b))
	    {
	        System.out.println("yes");
	        c1++;
	        break;
	    }
	}
	if(c1==0)
	{
	    System.out.println("no");
	}
	}
}
