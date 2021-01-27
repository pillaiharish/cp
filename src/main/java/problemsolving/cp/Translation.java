package problemsolving.cp;
// Translation
// https://codeforces.com/contest/41/problem/A
import java.util.Scanner;

public class Translation {
	public static String solve(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return "NO";
			
		}
		for(int i=0,j=s1.length()-1;i<s1.length()&&j>=0;i++,j--) {
			if(s1.charAt(i)!=s2.charAt(j)) {
				return "NO";
			}
		}
		return "YES";
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(solve(s1,s2));
		
		sc.close();
		
	}
}
