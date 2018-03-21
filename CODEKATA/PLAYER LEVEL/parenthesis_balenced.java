import java.io.*;
import java .util.*;
class a{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c[]=s.toCharArray();
        int i,count=0,count1=0;
        
        for(i=0;i<s.length();i++)
        {
            if(c[i]=='(')
            {
               count++;
               
            }
            else
            {
                count1++;
            }
        }
        if(count==count1)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}
