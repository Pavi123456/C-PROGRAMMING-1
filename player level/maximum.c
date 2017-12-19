#include<stdio.h>
void max(int a[],int n)
{
int i,max;
max=a[0];
for(i=1;i<n;i++)
{
if(a[i]>max)
{
max=a[i];
}
}
printf("%d",max);
return max;
}
void main()
{
int n,i;
scanf("%d",&n);
int a[n];
for(i=0;i<n;i++)
{
	scanf("%d",&a[i]);
}
max(a,n);
}
