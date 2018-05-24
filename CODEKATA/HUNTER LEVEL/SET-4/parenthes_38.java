import java.util.*;
public class parenthesis {

    static void printparenthes(char str[],int n,int pos,int open,int close)
    {
        if(close==n)
        {
            int i;
            for(i=0;i<str.length;i++)
            
                System.out.print(str[i]);
                System.out.println();
                return;
            
        }
        else{
        if(open>close)
        {
            str[pos]='}';
            printparenthes(str,n,pos+1,open,close+1);
        }
        if(open<n)
        {
            str[pos]='{';
            printparenthes(str,n,pos+1,open+1,close);
        }
    }
    }
	
	static void parenthes(char str[],int n)
	{
	    if(n>0)
	    {
	        printparenthes(str,n,0,0,0);
	        return;
	    }
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	char str[]=new char[100];
	parenthes(str,n);
	    
	}
}
	
	
			
