
#include <stdio.h>
#include<string.h>
int main(void) {
	char a[15],b[15];
	int l1,l2,i,flag,u,v;
	scanf("%s %s",a,b);
	l1=strlen(a);
	l2=strlen(b);
	for(i=0;i<l1;i++)
	{
		if(a[i]>=97 && a[i]<=122)
		{
			u=a[i];
			v=u-32;
			a[i]=v;
		}
	}
	for(i=0;i<l2;i++)
	{
		if(b[i]>=97 && b[i]<=122)
		{
			u=b[i];
			v=u-32;
			b[i]=v;
		}
	}
	if(l1==l2)
	{
	for(i=0;i<l1;i++)
	{
		if(a[i]==b[i])
		{
			flag=1;
		}
		else
		{
			flag=0;
			printf("No");
			break;
		}
	}
	}
	if(flag==1)
	printf("yes");
	return 0;
}
