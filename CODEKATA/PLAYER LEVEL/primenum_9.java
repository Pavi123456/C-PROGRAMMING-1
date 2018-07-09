
import java.util.*;

class GFG {
  
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,count=0,j;
	int l=sc.nextInt();
	int r=sc.nextInt();
	
	for(i=l;i<=r;i++)
	{
	    boolean flag = false;
	   for(j=2;j<=i/2;j++)
	   {
	       if(i%j==0)
	       {
	          
	            flag=true;
	          
	       }
	   }
	   if(flag==false)
	   {
	      
	       count++;
	   }
	}
	System.out.println(count);
	}
}
