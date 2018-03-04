#include <stdio.h>
#include<string.h>
int main() {
	char s[100],ch[20],count=0,i;
	scanf("%s",s);
	for(i=0;i<strlen(s);i++)
	{
if(s!=NULL)
{
    ch[i]=s[i];
    count++;
}
}
printf("%d",count);
	return 0;
}
