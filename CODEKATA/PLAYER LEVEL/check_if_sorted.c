  #include <stdio.h>

int main() {
int n,j,s,count=0;
scanf("%d",&n);
int a[n],i,b[n];
for(i=0;i<n;i++)
{
    scanf("%d",&a[i]);
    b[i]=a[i];
}

 for (i = 0; i < n; i++) 
 {
for (j = i + 1; j < n; j++)
{

if (a[i] > a[j]) 
{
s=  a[i];
a[i] = a[j];
a[j] = s;
}
}
}
for (i = 0; i < n; i++)
{
if(a[i]==b[i])
{
    count++;
}
}
if(count==n)
{
    printf("yes");
}
else
{
    printf("no");
}
}
