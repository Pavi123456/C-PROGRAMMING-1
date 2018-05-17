import java.util.*;  
class unique{  
 public static void main(String args[]){  
  
  HashSet<Integer> set=new HashSet<Integer>(); 
  Scanner sc=new Scanner(System.in);
  int n,i,j,t=0;
  n=sc.nextInt();
  int a[]=new int[n];
    int b[]=new int[n];
  for(i=0;i<n;i++)
  {
      a[i]=sc.nextInt();
      
  }
   for(i=0;i<n;i++)
   {
       for(j=i+1;j<n;j++)
       {
           if(a[i]==a[j])
           {
             
               b[t]=a[i];
               t++;
               break;
           }
       }
   }
  if(t>0)
  {
  
   System.out.print(b[0]+" "); 
   
   }
   else{
      System.out.print("unique"); 
   }
  }  
 }  
