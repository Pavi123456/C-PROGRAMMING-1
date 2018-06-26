import java.util.*;
class checkingsubstring{
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       String s1=sc.nextLine();
       
       String s2=sc.nextLine();
       s1+='a';
       int l1=s1.length();
       
       String s[]=new String[100];
       int i,j,start,end,u=0,count=0;
       for(i=0;i<l1-1;i++)
       {
           for(j=i+1;j<l1;j++)
           {
               start=i;
               end=j;
               
               s[u]=s1.substring(start,end);
               u++;

           }
       }
       for(i=0;i<u;i++)
       {
           if(s2.equals(s[i]))
           {
               System.out.println("yes");
               count++;
               break;
           }
       }
       if(count==0)
       {
           System.out.println("no");
       }
        }
}    
       
