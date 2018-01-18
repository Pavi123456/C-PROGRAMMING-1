import java.io.*;
import java.util.*;
class check_str{
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,l;
StringBuffer s=new StringBuffer(sc.next());
String S=s.toString();
   
StringBuffer rev=s.reverse();
   String a=rev.toString();
     
if(S.compareTo(a)==0)
{
    System.out.println("yes");
}
else
{
    System.out.println("no");
}
}
}
