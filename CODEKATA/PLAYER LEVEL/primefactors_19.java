
import java.util.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    HashSet<Integer> set=new HashSet<Integer>();  
    int i,k;
    for (i = 2; i <=n; i++) {
 
            while (n % i == 0) {
                set.add(i);
                n = n/ i;
            }
            
        }
 
     if (n < 1) 
        System.out.println(n);
    Iterator<Integer> itr=set.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next()+" "); 
    }}
	
}
