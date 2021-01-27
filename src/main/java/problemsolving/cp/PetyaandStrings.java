package problemsolving.cp;

import java.util.Scanner;

public class PetyaandStrings {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String s1=sc.next();
//		String s2=sc.next();
//		int n=s1.compareToIgnoreCase(s2);
//		sc.close();
//		if(n==0) {
//			System.out.println("0");
//		}
//		else if(n>0) {
//			System.out.println("1");
//		}
//		else if(n<0) {
//			System.out.println("-1");
//		}
//	}
	public static void compareStrings(String s1, String s2) {
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		int var=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==s2.charAt(i)) {
			}
			else if(s1.charAt(i)<s2.charAt(i)) {
				var=-1;
				break;
			}
			else if(s1.charAt(i)>s2.charAt(i)) {
				var=1;
				break;
			}
			
		}
		System.out.println(var);
			
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		compareStrings(s1,s2);
		sc.close();
	}
}
