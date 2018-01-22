import java.io.*;
import java.util.*;
class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        String s1="";
        s1+=sc.nextLine();
        String s[]=s1.split("\\s");
        for(String w:s)
        {
            count++;
        }
        System.out.print(count);
        
        
    }
}
