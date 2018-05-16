import java.util.*;  
class largestnumber{  
 public static void main(String args[]){  
  Scanner sc=new Scanner(System.in);
  HashSet <Integer> set = new HashSet <Integer>();
  int n,i,j,temp,count=0;
  n=sc.nextInt();
  int a[]=new int[n];
    int b[]=new int[n];
  for(i=0;i<n;i++)
  {
      a[i]=sc.nextInt();
      
  }
  for(i=1;i<n;i++)
  {
  if(a[0]==a[i])
  {
      count++;
  }
  }
   
  if(count==n-1)
  {
    System.out.println(a[1]);  
  }
  else{
   for(i=0;i<n;i++)
   {
       for(j=i+1;j<n;j++)
       {
          if(a[i]<a[j])
          {
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
          }
       }
   }
  
  
 
   for(i=0;i<n;i++)
   {
       System.out.print(a[i]);
   }
  }
 }
}
