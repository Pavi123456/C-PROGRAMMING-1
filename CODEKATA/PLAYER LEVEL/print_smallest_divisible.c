#include <stdio.h>

int main() {
int n,l,r;
scanf("%d",&l);
scanf("%d",&r);
if(r%r==0&&r%l==0)
{
    printf("%d",r);
}
if(l%r==0&&l%l==0)
{
     printf("%d",l);
}
	return 0;
}
