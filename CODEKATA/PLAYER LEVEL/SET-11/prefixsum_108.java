
import java.util.*;
import java.lang.*;
class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int i,n,sum=0;
	    n=sc.nextInt();
	    int a[]=new int[n];
	    int b[]=new int[n];
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    System.out.print(a[0]+" ");
	    sum=a[0];
	    for(i=1;i<n;i++)
	    {
	        sum+=a[i];
	        System.out.print(sum+" ");
	    }
	    
	}
}
