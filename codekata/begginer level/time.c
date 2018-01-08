#include <stdio.h>
#include<time.h>
int main() {
	int hr,mins,hr1,mins1,v1,v2;
	scanf("%d %d",&hr,&mins);
	scanf("%d %d",&hr1,&mins1);
	v1=abs(hr-hr1);
	v2=abs(mins-mins1);

	printf("%d %d",v1,v2);
	return 0;
}
