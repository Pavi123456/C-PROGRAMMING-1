
import java.io.*;
import java.util.*;
class check_str{
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,count=0,count1=0,co=0;
	String s="";
	s+=sc.nextLine();
int l=s.length();
for(i=0;i<l;i++)
{
	 if(s.charAt(i)>='0'&&s.charAt(i)<='9')
	 {
	  count++;
	}

	if(s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z')
	{
	    count1++;
	}
	
}

	if(count==0)
	{
	    System.out.print("no"); 
	}
	else{
	    System.out.print("yes"); 
	}
	}
}
