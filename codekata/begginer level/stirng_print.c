#include<stdio.h>
#include<string.h>
int main()
{
char s[50];
gets(s);
int n,i;
scanf("%d",&n);
for(i=0;i<n;i++)
{
    printf("%s\n",s);
}

}
