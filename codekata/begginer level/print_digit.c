#include<stdio.h>
int main(void)
{
   int n,rem=0,rev=0,count=0,i;
   scanf("%d",&n);
   while(n!='\0')
   {
       rem=n%10;
       
       rev=(rev*10)+rem;
       n=n/10;
}
n=rev;

while(n!='\0')
{
    rem=n%10;
    printf("%d ",rem);
    n=n/10;
}
   
}
