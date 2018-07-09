
import java.util.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String v="";
    char c[]=s.toCharArray();
    int i,l,n;
    l=s.length();
    for(i=0;i<l;i++)
    {
        if((int)c[i]>=90)
        {
            n=65+2;
            char d=(char)n;
            v+=d;
        }
        else
        {
            n=(int)c[i];
        n+=3;
        char d=(char)n;
        v+=d;
        }
        
    }
    
System.out.println(v);
	}
}
