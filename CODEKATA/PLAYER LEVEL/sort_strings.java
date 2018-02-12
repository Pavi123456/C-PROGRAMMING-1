import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Arrays.*;
class a{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       
        int n,i;
        n=sc.nextInt(); 
        String s[]=new String[n];
        for(i=0;i<n;i++)
        {
            s[i]=sc.next();
            
        }
        Arrays.sort(s);
        for(i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
