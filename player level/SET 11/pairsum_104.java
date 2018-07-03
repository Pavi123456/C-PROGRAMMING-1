
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int i,sum=0;
	    int a[]=new int[n];
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    for(i=0;i<n-1;i++)
	    {
	        sum+=(a[i]+a[i+1]);
	    }
	    System.out.println(sum);
	}
}
