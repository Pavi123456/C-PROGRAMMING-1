#include <stdio.h>

int main(void) {
    int count=0;
	char a[15],k;
	scanf("%s %c",a,&k);
	int i;
	for(i=0;a[i]!='\0';i++)
	{
		if(a[i]==k)
		{
			count++;
		}
	}
	printf("%d",count);
	return 0;
}
