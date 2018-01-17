#include <stdio.h>
#include<string.h>
int main() {
	char str[1000];
	int i,l,count=1;
	scanf("%[^\t\n]s",str);
	l=strlen(str);
	for(i=0;i<l;i++)
	{
	  if(str[i]=='.'&&str[i+1]!='\0')  
	  {
	      count++;
	  }
	}
	printf("%d",count);
	return 0;
}
