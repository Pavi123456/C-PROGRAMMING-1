import java.util.*;
public class maxsubarray 
{
	public static void main(String[] args)
	{
		int n,pro=0,i,max,j;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
	    max=a[0];
		for(i=0;i<n;i++)
		{	 
		  pro=0;
		  pro=a[i];
		  for(j=i+1;j<n;j++)
		  {
			pro=pro*a[j];
		  }
			if(pro>max)
			   max=pro;
			  
		  
		}
		System.out.print(max);
	}
}
