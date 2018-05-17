import java.util.*;
class A{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int a[] = new int[m];
        int b[] = new int[n];
        
        int i;
        
        for(i=0;i<m;i++){
            a[i] = in.nextInt();
            
        }
        int j;
        for(j=0;j<n;j++){
            b[j] = in.nextInt();
            
        }
       HashSet<Integer> hset= new HashSet<>();
		
	
		for(i = 0; i < m; i++)
		{
			if(!hset.contains(a[i]))
				hset.add(a[i]);
		}
			
		int flag=0;
		for( i = 0; i < n; i++)
		{
			if(!hset.contains(b[i])){
				flag =0;
				break;
			}
			else{
			    flag=1;
			}
		}
		if(flag==0){
		    System.out.println("No");
		}
		else{
		    System.out.println("Yes");
		}
        
    }
}
