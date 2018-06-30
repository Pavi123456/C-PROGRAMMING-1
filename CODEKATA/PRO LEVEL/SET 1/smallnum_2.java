import java.io.*;
import java.util.*;
class smallnum{
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,j,k;
	String x="";
	//long n=sc.nextInt();
	String s=sc.next();
//	
	k=sc.nextInt();
	int l=s.length();
	
	int t=l-k;
	int t1=t+1;
	String a[]=new String[t1];
	int u=0,m=0,count=0;
	if(k==0)
	{
	    System.out.println(s);
	}
	if(k>0)
	{
	for(i=0;i<t1;i++)
	{
	   count=0;
	   while(count<k)
	   {
	        x+=s.charAt(u);
	       
	        u++;
	        count++;
	        if(count==k)
	        {
	          a[i]=x;
	         
	            x="";  
	            m++;
	            u=m;
	             
	        }
	        else{
	            continue;
	        }
	       
	   }
	      	}
	      	Arrays.sort(a);
	      	
	      	System.out.print(a[0]);
}
}
}
