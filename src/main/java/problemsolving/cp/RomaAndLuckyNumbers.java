package problemsolving.cp;

import java.util.Scanner;

public class RomaAndLuckyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		for(int i =0;i<n;i++) {
			
			String s=sc.next();
			
			int luckyCount=0;
			for(int j=0;j<s.length();j++) {
				
				if(s.charAt(j)=='4'||s.charAt(j)=='7') {
					luckyCount++;
				}
			}
			if(luckyCount<=k) {
				count++;
			}

		}
		sc.close();
		System.out.println(count);
	}

}
