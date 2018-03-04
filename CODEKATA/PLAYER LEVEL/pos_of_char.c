#include <stdio.h>

int main(void) {
	char a[15],k;
	scanf("%s %c",a,&k);
	int i;
	for(i=0;a[i]!='\0';i++)
	{
		if(a[i]==k)
		{
			printf("%d",i+1);
		}
	}
	return 0;
}
