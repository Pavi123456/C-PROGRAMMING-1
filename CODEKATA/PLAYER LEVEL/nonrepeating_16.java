

import java.util.*;

class nonrepeating {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int i,j,count=0;
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    for(i=0;i<n-1;i++)
    {
        count=0;
        for(j=0;j<n;j++)
        {
            if(a[i]!=a[j])
            {
                count++;
            }
        }
       
        if(count==n-1)
        {
           System.out.println(a[i]); 
        }
    
	}
	count=0;
	for(i=0;i<n-1;i++)
    {
        
        if(a[n-1]!=a[i])
    {
        count++;
    }
    }
	if(count==n-1)
        {
           System.out.println(a[n-1]); 
        }
	
	}
}
