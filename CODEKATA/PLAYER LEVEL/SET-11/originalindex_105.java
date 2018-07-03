

import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int i,sum=0,j;
	    int a[]=new int[n+1];
	   int b[]=new int[n+1];
	    for(i=1;i<=n;i++)
	    {
	        a[i]=sc.nextInt();
	        b[i]=a[i];
	    }
	    
	    Arrays.sort(b);
	    for(i=1;i<=n;i++)
	    {
	        for(j=1;j<=n;j++)
	        {
	        if(b[i]==a[j])
	        {
	            System.out.print(i+" ");
	        }
	        }
	    }
	    
	}
}
