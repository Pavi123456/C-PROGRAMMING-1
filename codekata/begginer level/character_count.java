
import java.io.*;
import java.util.*;
class character_count {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,count=0;
	String s="";
	s+=sc.nextLine();
	
	String s1=s.replaceAll(" ","");
	int l=s1.length();
	for(i=0;i<l;i++)
	{
	  count++;
	}
	
	
	System.out.print(count);
	}
}
