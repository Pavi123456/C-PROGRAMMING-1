#include <stdio.h>

int main(void) {
	int n,k;
	scanf("%d %d",&n,&k);
	int a[n];
	int i,j,t;
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	
	}
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
	
		printf("%d",a[k]);
	
	return 0;
}
