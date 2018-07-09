
import java.util.*;

class GFG {
    static int size=256;
    public static boolean isomorphic(String s1,String s2)
    {
        int l1=s1.length();
        int l2=s2.length();
        int i;
        if(l1!=l2)
        {
            return false;
        }
        Boolean mark[]=new Boolean[size];
        Arrays.fill(mark,Boolean.FALSE);
        int map[]=new int[size];
        Arrays.fill(map,-1);
        for(i=0;i<l1;i++)
        {
            if(map[s1.charAt(i)]==-1)
            {
                if (mark[s2.charAt(i)] == true)
                    return false;
                mark[s2.charAt(i)]=true;
                map[s1.charAt(i)]=s2.charAt(i);
            }
             else if (map[s1.charAt(i)] != s2.charAt(i))
            return false;
        }
        return true;
    }
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	boolean t;
	t=isomorphic(s1,s2);
	if(t==true)
	{
	    System.out.println("yes");
	}
	else{
	    System.out.println("no");
	}
	}
}
