import java.util.*;  
class oddevenpositionmatching{  
 public static void main(String args[]){  
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
      if(i%2==0)
      {
          if((a[i]%2)!=0)
          {
              System.out.print(a[i]+" ");
          }
      }
       if(i%2!=0)
      {
          if((a[i]%2)==0)
          {
              System.out.print(a[i]+" ");
          }
      }
  }
  }  
 }  
