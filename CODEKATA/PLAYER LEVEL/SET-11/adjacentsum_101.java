import java.io.*;
import java.util.*;
class adjacentsum{
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,sum=0;
	int n=sc.nextInt();
	int a[]=new int[n];
	for(i=0;i<n;i++)
	{
	    a[i]=sc.nextInt();
	}
	for(i=0;i<n-1;i++)
	{
	    if(a[i]>a[i+1])
	    {
	        sum+=a[i];
	    }
	    else{
	        sum+=a[i+1];
	    }
	}
	System.out.println(sum);
	}
}
