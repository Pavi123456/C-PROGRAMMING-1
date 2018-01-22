#include<stdio.h>
int main()
{
int n,i;
scanf("%d",&n);
for(i=1;i<=10;i++)
{
   if(n==i) 
   {
       printf("yes");
       break;
   }
   else
   {
       i++;
   }
   
}
}
