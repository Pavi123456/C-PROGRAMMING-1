import java.io.*;
import java.util.*;
class numeric{
 public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
   String b=sc.next();
   int l1=a.length();
   int l2=b.length();
   int k=sc.nextInt();
    int i,count=0;
    char c1[]=new char[l1];
    char c2[]=new char[l2];
    if(l1==l2)
    {
    for(i=0;i<l1;i++)
    {
        c1[i]=a.charAt(i);
        c2[i]=b.charAt(i);
        
            if(c1[i]!=c2[i])
            {
                count++;
            }
        }
    }
        
        if(count==k)
        {
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}
    
    
    
