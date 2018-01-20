
#include<stdio.h>
int main()
{
    char str[50],temp;
    int i;
    scanf("%s",str);
    int l=strlen(str);
    for(i=0;i<l;i=i+2)
    {
        temp=str[i];
        str[i]=str[i+1];
        str[i+1]=temp;
    }
    if(l%2==0)
    {
        printf("%s",str);
    }
    else
    {
        printf("%s%c",str,temp);
    }
}    
