
import java.util.*;
import java.lang.*;
class stringpos{
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int i;
	    String s=sc.nextLine();
	    String s1=sc.nextLine();
	    String w[]=s.split(" ");
	    
	    for(i=0;i<w.length;i++)
	    {
	        if(w[i].equals(s1))
	        {
	            System.out.print(i+1);
	            break;
	        }
	    }
	    
	    
	}
}
