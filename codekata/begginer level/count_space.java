import java.io.*;
import java.util.*;
class character_count {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,count=0;
	String s="";
	s+=sc.nextLine();
	String[] words=s.split("\\s");
	for(i=0;i<words.length;i++)
	{
	    count++;
	}
    
	
	
	System.out.print(count-1);
	}
}
