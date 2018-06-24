import java.io.*;
import java.util.*;
class alternatesorting{
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
    int n,i,j,temp=0;
    n=sc.nextInt();
    int a[]=new int[n];	
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n-i-1;j++)
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    i=0;j=n-1;
    while(i<j)
    {
        System.out.print(a[j]+" "+a[i]+" ");
        j--;
        i++;
    }
    if(n%2!=0)
    {
         System.out.print(a[i]); 
    }
    
	}
}
