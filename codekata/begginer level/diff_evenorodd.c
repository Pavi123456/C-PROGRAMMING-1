#include<stdio.h>
void main()
{
int n,m,i,diff;
scanf("%d %d",&n,&m);
diff=abs(n-m);
if(diff%2==0)
{
    printf("even");
}
else
{
    printf("odd");
}
}


