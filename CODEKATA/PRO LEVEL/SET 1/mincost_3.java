import java.io.*;
import java.util.*;
import java.math.*;
class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		int count=0;
		int l1 = s1.length();
		int l2 = s2.length();
		int i,j;
		for(i=0;i<l1;i++){
		    if(s1.charAt(i) != s2.charAt(i)){
		        count++;
		    }
		}
		int dif = Math.abs(l1-l2);
		System.out.println(count+dif);
	}
}
