#include <stdio.h>
int main(void)
{
char str[100];
scanf("%[^\n]s",str);
if(printf("%s",str))
	return 0;
}
