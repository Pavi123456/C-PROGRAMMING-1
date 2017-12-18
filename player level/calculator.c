#include<stdio.h>

void add(int a,int b)
{
int c=a+b;
printf("%d,",c);
}
void sub(int a,int b)
{
int c=a-b;
printf("%d,",c);
}
void mul(int a,int b)
{
int c=a*b;
printf("%d,",c);
}
void div(int a,int b)
{
int c=a/b;
printf("%d,",c);
}
void mod(int a,int b)
{
int c=a%b;
printf("%d",c);
}
main()
{
add(5,5);
sub(5,5);
mul(5,5);
div(5,5);
mod(5,5);
}
