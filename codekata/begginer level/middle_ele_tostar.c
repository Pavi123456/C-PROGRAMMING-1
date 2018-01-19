#include<stdio.h>
#include<string.h>
int main()
{
    char str[50];
    scanf("%s",str);
    int mid;
    int l=strlen(str);
    if(l%2!=0)
    {
        mid=l/2;
        str[mid]='*';
        printf("%s",str);
    }
    else
    {
        mid=l/2;
        str[mid]='*';
        str[mid-1]='*';
        printf("%s",str);
    }
}
