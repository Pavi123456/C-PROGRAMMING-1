#include <stdio.h>
int main() {
int n,a[100],i;
scanf("%d",&n);
a[0]=1;
a[1]=1;
for(i=2;i<n;i++)
{
  a[i]=a[i-2]+a[i-1] ;
    
}
for(i=0;i<n;i++)
{
printf("%d ",a[i]);
}
}
