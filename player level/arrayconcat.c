#include<stdio.h>
int main(void)
{
	int n1,n2,i,j,k;
	scanf("%d",&n1);
	scanf("%d",&n2);
	int a[n1],b[n2],c[100],d[100];
	for(i=0;i<n1;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n2;i++)
	
	{
		scanf("%d",&b[i]);
	}
	for(i=0;i<n1;i++)
	{
		c[i]=a[i];
	}
	k=n1+n2;
	for(i=n1;i<k;i++)
	{
		for(j=0;j<n2;j++)
		{
		
		c[i]=b[j];
		i++;
	}
	}
		for(i=0;i<k;i++)
	{
		printf("%d ",c[i]);
	}
	
}
