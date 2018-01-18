#include <stdio.h>
int main() {
int n,ma,i;
scanf("%d",&n);
int a[n];
for(i=0;i<n;i++)
{
    scanf("%d",&a[i]);
}
ma=a[0];
for(i=1;i<n;i++)
{
if(ma<a[i])
{
    ma=a[i];
}
}
printf("%d",ma);
}
