package problemsolving.cp;
// https://codeforces.com/contest/4/problem/A
import java.util.Scanner;

public class Watermelon {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			sc.close();
			// 2 is even and can be divided into 1+1
			// both are odd numbers
			if(a%2==0&&a>2) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
 
}
