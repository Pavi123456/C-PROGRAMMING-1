#include<stdio.h>
int main()
{
int num,i,n;
scanf("%d",&num);
for(i=1;i<num;i++)
{
    n=i*2;
    
    if(n==num)
    {
        printf("yes");
        break;
    }
}

}
