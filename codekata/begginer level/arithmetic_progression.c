#include<stdio.h>
int main(void)
{
    int n,a,d,ap;
    scanf("%d %d %d",&n,&a,&d);
    ap=(n*(2*a+(n-1)*d))/2;
    printf("%d",ap);
}
