#include<stdio.h>
int main()
{
    int n,m,res,p,lcm,i;
    scanf("%d %d",&n,&m);
    for(i=1;i<=n&&i<=m;i++)
    {
        if(n%i==0&&m%i==0)
        {
            p=i;
        }
    }
    lcm=(m*n)/p;
    printf("%d",lcm);
    }
  
