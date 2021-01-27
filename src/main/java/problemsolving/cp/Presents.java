package problemsolving.cp;

import java.util.Scanner;

public class Presents {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		 /*
		  * here the index starts from 1 and each value is an index 
		  * for other array. New array to store values from older 
		  * array.
		  */
		
		int arr2[]=new int[n];
		for(int i=0;i<n;i++) {
			arr2[arr[i]-1]=i+1;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr2[i]+" ");
		}
		sc.close();

	}
}
