package problemsolving.cp;

import java.util.Scanner;

public class PerfectPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=i+1;
		}
		if(n%2==1) {
			System.out.println(-1);
		}
		else {
			for(int i=0;i<n;i=i+2) {
				System.out.print(arr[i+1]+" "+arr[i]+" ");
			}
		}
		
	}

}
