
import java.io.*;
import java.util.*;
class check_strvowel{
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
String s=sc.next();
int i,l,v=0;
l=s.length();
for(i=0;i<l;i++)
{
    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
    {
        v++;
    }
    
}
if(v>=1)
{
    System.out.print("yes");
}
else{
     System.out.print("no");
}
}
}
