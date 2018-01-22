#include <stdio.h>
int main(void)
{
int a,b,res;
scanf("%d %d",&a,&b);
res=a+b;
if(res%2==0)
{
    printf("even");
}
else
{
    printf("odd");
}
}
