
import java.util.*;

class GFG {
  
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	char c[]=s1.toCharArray();
	c[0]=Character.toUpperCase(c[0]);
	int i,l;
	l=s1.length();
	for(i=0;i<l-1;i++)
	{
	    if(c[i]==' ')
	    {
	        c[i+1]=Character.toUpperCase(c[i+1]);
	    }
	}
	String s=String.valueOf(c);
    System.out.println(s);
	}
}
