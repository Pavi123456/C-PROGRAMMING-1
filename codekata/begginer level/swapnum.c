#include <stdio.h>
int main() {
int n1,n2,temp;
scanf("%d %d",&n1,&n2);
temp=n1;
n1=n2;
n2=temp;
printf("%d %d",n1,n2);
}
