#include<stdio.h>
int main(void)
{
	int i,arr[100],n,swap=0,j;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				swap=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=swap;
			}
		}
	}
	for(i=0;i<n;i++)
	{
		printf("%d\n",arr[i]);
	}
}
