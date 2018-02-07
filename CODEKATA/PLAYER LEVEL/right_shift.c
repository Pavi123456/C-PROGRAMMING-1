#include<stdio.h>
int main()
{
    int i,n,k,temp,temp1;
    scanf("%d",&n);
    scanf("%d",&k);
    int a[n],j;
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<k;i++)
    {
         temp=a[0];
       
        for(j=1;j<n;j++)
        {
       
        a[j-1]=a[j];
        }
        a[n-1]=temp;
    }
    for(i=0;i<n;i++)
    {
        printf("%d ",a[i]);
    }
    return 0;
}
