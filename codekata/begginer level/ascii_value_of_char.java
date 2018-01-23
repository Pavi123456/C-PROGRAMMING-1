import java.io.*;
import java.util.*;
class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i,l;
        int a[]=new int[10];
        char ch[]=new char[10];
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch[i]=s.charAt(i);
            a[i]=(int)ch[i];
             System.out.print(a[i]);
        }
       
    }
}
