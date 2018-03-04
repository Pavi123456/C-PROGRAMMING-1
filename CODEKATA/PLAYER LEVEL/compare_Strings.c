#include <stdio.h>
#include<string.h>
int main() {
	char s1[100],s2[100],ch[20],count=0,i;
	scanf("%s",s1);
		scanf("%s",s2);
	int l1=strlen(s1);
		int l2=strlen(s2);
		if(l1==l2)
		{
	for(i=0;i<l1;i++)
	{
if(s1[i]==s2[i])
{
    count++;
}
}
}
if(count==l1)
{
printf("yes");
}
else
{
    printf("no");
}
	return 0;
}
