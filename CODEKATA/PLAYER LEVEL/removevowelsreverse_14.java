
import java.util.*;

class removevowelsreverse{
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int l=sc.nextInt();
	String s=sc.nextLine();
    char c[]=s.toCharArray();
    String v="";
    int i;
    
    for(i=0;i<l;i++)
    {
        if(c[i]!='a'&&c[i]!='e'&&c[i]!='i'&&c[i]!='o'&&c[i]!='u'&&c[i]!='A'&&c[i]!='E'&&c[i]!='I'&&c[i]!='O'&&c[i]!='U')
        {
            v+=c[i];
        }
    }
char d[]=v.toCharArray();
int l1=v.length();
v="";
for(i=l1-1;i>=0;i--)
{
v+=d[i];   
}
System.out.println(v);
	}
}
