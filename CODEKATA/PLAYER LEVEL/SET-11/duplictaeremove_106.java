
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int i,u=0,j;
	    int a[]=new int[n];
	   int b[]=new int[n];
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	        
	    }
	    Arrays.sort(a);
	    if (n==0 || n==1){
            System.out.print(a[n-1]);
        }
	    else{
	    for(i=0;i<n-1;i++)
	    {
	  if(a[i]!=a[i+1])
	            {
	                b[u]=a[i];
	                
	                u++;
	               
	           
	               
	            }
	           
	            
	        }
	       
	         for(i=0;i<=u;i++)
	         {
	        b[u]=a[n-1];
	        
	         }
	               
	               
	    
	              u++;  
	        
	    
	    for(i=0;i<u;i++)
	    {
	        System.out.print(b[i]+" ");
	    }
	}
	    
	}
}
