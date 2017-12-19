#include<stdio.h>
void main()
{
int i,sum=0,temp=0,b=0;
int a=9;
for(i=0;i<4;i++)
{
sum=(temp*10)+a;
temp=sum;
b=b+temp;
}
printf("%d",b);
}
