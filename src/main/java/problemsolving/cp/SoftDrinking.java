package problemsolving.cp;

import java.util.Scanner;

public class SoftDrinking {
	/*
	 * (k*l)/nl 
	 * (c*d)
	 * (p/np)*/
	public static void main(String[] args) {
//		int n, k, l, c, d, p, nl, np;
		int[] arr=new int[8];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<8;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		int a1=(arr[1]*arr[2])/arr[6];
		int b1=(arr[3]*arr[4]);
		int c1=arr[5]/arr[7];
		int min=a1;
		if(min>b1) {
			min=Math.min(b1, c1);
		}
		else {
			min=Math.min(min, c1);
		}
		System.out.println(min/arr[0]);
	}

}
