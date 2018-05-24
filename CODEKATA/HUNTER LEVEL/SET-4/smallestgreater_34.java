
import java.util.*;
public class nextgreater 
{
	
	static void swap(char ar[], int i, int j) 
	{
		char temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
    static void traverse(char d[], int l) 
	{
		int i;
		for (i = l- 1; i > 0; i--) 
		{
			if (d[i] > d[i - 1]) {
				break;
			}
		}
	
		if (i == 0) 
		{
			System.out.println("impossible");
		} 
		else
		{
			int x = d[i - 1], min = i;
			for (int j = i + 1; j < l; j++) 
			{
				if (d[j] > x && d[j] < d[min]) 
				{
					min = j;
				}
			}
			swap(d, i - 1, min);

			Arrays.sort(d, i, l);
			
			for (i = 0; i < l; i++)
				System.out.print(d[i]);
		}
	}

	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String x=Integer.toString(n);
		char d[] = x.toCharArray();
		int l = d.length;
		traverse(d, l);
	}
}
