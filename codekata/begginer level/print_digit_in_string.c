#include<stdio.h>
#include<string.h>
int main(void)

{
char ch[100];
int k,i;
gets(ch);
k=strlen(ch);
for(i=0;i<k;i++)
{
	if(isdigit(ch[i]))
	{
		printf("%c",ch[i]);
	}
	
}

}
