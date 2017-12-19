#include<stdio.h>
void main()
{
int digit,count=0,n=0;
scanf("%d",&digit);
while(digit>0)
{
n=digit%10;
count++;
digit/=10;
}
printf("%d",count);
}
