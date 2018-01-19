#include<stdio.h>
#include<string.h>
int main()
{
    char str[50];
    int n,i;
    scanf("%s",str);
    scanf("%d",&n);
    int l=strlen(str);
    for(i=0;i<n;i++)
    {
   printf("%c",str[i]);
    }
         
}
