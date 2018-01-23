#include <stdio.h>
#include<string.h>
int main()
{
    char s1[100];
    int l,i,j,count=0;
    scanf("%s",s1);
    l=strlen(s1);
    for(i=0;i<l;i++)
    {
        for(j=i+1;j<l;j++)
        {
            if(s[i]==s[j])
            {
            count=1;
            break;
            }
        
            else
            continue;
        }
    }
    
    if(count==0)
    printf("yes");
    else
    printf("no");
    return 0;
}
