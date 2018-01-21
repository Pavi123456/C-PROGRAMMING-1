import java.io.*;
import java.util.*;
class st{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        String s=sc.next();
       String s1=sc.next();
        if(s.compareTo(s1)==1)
        {
            System.out.print(s);
        }
        else if(s.compareTo(s1)==-1)
        {
           System.out.print(s1); 
        }
        else if(s.compareTo(s1)==0)
        {
           System.out.print(s + s1);  
        }
    }
}
