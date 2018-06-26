import java.util.*;
class sum{
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,mid,k;
        int sum1=0,sum2=0,count=0;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            mid=i+1;
            sum1=0;
            sum2=0;
            for(j=0;j<n;j++)
            {
               if(j<mid)
               {
                    sum1+=a[j];
                    
                }
            }
            for(k=0;k<n;k++)
            {
                if(k>mid)
                {
                    sum2+=a[k];
                    
                }
            }
            if(sum1==sum2)
            {
                System.out.print("yes");
                count++;
                break;
            }
        
        }
        if(count==0)
        {
            System.out.print("no");
        }
    }
}
   
