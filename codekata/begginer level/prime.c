#include<stdio.h>
void main()
{
   int n,i,flag=1;
   scanf("%d",&n);
   for(i=2;i<n/2;i++)
   {
   if(n%i==0)
   {
       flag=0;
       printf("not prime");
       break;
   }
   
   }
   if(flag==1)
   {
       printf("prime");
   }
   
}
