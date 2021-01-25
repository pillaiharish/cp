package problemsolving.cp;

import java.util.Scanner;

public class Reconnaissance2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		int diff=Math.abs(arr[n-1]-arr[0]);
		int prev=n-1,curr=0;
		for(int i=1;i<n;i++) {
			if(diff>Math.abs(arr[i]-arr[i-1])) {
				diff=Math.abs(arr[i]-arr[i-1]);
				prev=i-1;
				curr=i;
			}
		}
		System.out.print((prev+1)+" "+(curr+1));
	}

}
