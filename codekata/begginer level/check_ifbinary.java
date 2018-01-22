import java.io.*;
import java.util.*;
class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1;
        int count=0,i;
        s1=sc.next();
        int len=s1.length();
        char c[]=new char[len];
        for(i=0;i<len;i++)
        {
           c[i]=s1.charAt(i);
           if(c[i]=='1'||c[i]=='0')
           {
               count++;
           }
           
        }
        
         if(count>0)
         {
             System.out.print("yes");
         }
         else{
             System.out.print("no");
         }
        
        
        
    }
}
