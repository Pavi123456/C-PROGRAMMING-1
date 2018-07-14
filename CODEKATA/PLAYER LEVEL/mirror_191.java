import java.util.*;
class mirror{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,c=0,count=0;
        int a[]=new int[n];
        int b[]=new int[n];
        int rev[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=n-1;i>=0;i--)
        {
            rev[c]=a[i];
            c++;
        }
        for(i=0;i<n;i++)
        {
            if(b[i]==rev[i])
            {
                count++;
            }
        }
        if(count==n)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
