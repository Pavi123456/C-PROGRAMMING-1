#include <stdio.h>

int main() {
int n,l,r,a,b,count=0,count1=0;
scanf("%d",&l);
scanf("%d",&r);
if(l==r)
{
    printf("%d",l);
   
}
if(l!=r)
{
if(r%r==0&&r%l==0)
{
    
    count++;
}
if(l%r==0&&l%l==0)
{ 
     count1++;
}
}
if(count>0)
{
printf("%d",r);
}
if(count1>0)
{
   printf("%d",l); 
}
	return 0;
}
