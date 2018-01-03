#include<stdio.h>
int main(void)
{
	int i,a[100],n;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++)
	{
		printf("%d %d\n",a[i],i);
	}
}
