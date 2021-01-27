package problemsolving.cp;

import java.util.Scanner;

// https://codeforces.com/contest/71/problem/A
public class WayTooLongWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		while(i<n) {
			String s=sc.next();
			if(s.length()<=10) {
				System.out.println(s);
			}
			else if(s.length()>10){
				System.out.println(s.charAt(0)+""+(s.length()-2)+""+s.charAt(s.length()-1));
			}
			i++;
		}
		sc.close();
	}
}
