

import java.util.*;

class mostrepeating {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine().trim();
    char c[]=s.toCharArray();
    int l=s.length();
    int i,count=0,max,j;
    max=0;
    String v="";
    for(i=0;i<l-1;i++)
    {
        count=0;
        
        for(j=i+1;j<l;j++)
        {
        if(c[i]==c[j])
        {
            c[j]='*';
            count++;
        }
        if(max<count)
        {
            v="";
            max=count;
            v+=c[i];
            
        }
       
    }
	}
	System.out.print(v);
	}
}
