#include <stdio.h>
int main()
{
int n;
scanf("%d",&n);
int a[n],i,min,min1,pos;
for(i=0;i<n;i++)
{
    scanf("%d",&a[i]);
}
min=a[0];
for(i=1;i<n;i++)
if(min>a[i])
{
    min=a[i];
    pos=i;
}
for (i = pos; i <  n - 1; i++)
            {
                a[i] = a[i + 1];
            }
min=a[0];
for(i=1;i<n-1;i++)
{
    if(min>a[i])
    {
         min=a[i];
    }
}
           
printf("%d",min);


return 0;
}
