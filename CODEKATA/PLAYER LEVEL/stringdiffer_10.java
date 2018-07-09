
import java.util.*;

class GFG {
  
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    String s2=sc.next();
    int l1=s1.length();
    int l2=s2.length();
    char c1[]=s1.toCharArray();
    char c2[]=s2.toCharArray();
    int i,j,count=0;
    if(l1!=l2)
    {
       count=0;
    }
    else{
        for(i=0;i<l1;i++)
        {
            if(c1[i]==c2[i])
            {
                
            }
            else{
               count++; 
            }
        }
    }
    if(count==1)
    {
        System.out.println("yes");
    }
    else
	System.out.println("no");
	}
}
