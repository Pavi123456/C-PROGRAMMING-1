#include<stdio.h>
void main()
{
    int n1,count=0;
    scanf("%d",&n1);
    int a[n1],i;
    for(i=0;i<n1;i++)
    {
        scanf("%d",&a[i]);
    }
    int n2;
    scanf("%d",&n2);
    int b[n2];
    for(i=0;i<n2;i++)
    {
        scanf("%d",&b[i]);
    }
    int c[100],j;
    for(i=0;i<n1;i++)
    {
       c[i]=a[i];
       
    }
   
    j=0;
    int d; 
   
    if(j<n2)
    {
        d=n1;
        c[d]=b[j];
       d++;
    }
    
   
    
    int m=n1+n2;
    for(i=0;i<m;i++)
    {
        printf("%d\n",c[i]);
    }
    
  
}
