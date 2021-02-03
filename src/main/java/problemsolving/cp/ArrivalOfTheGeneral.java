package problemsolving.cp;

import java.util.Scanner;

public class ArrivalOfTheGeneral {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		int maxIndex=-1,minIndex=-1;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
			if(max<arr[i]) {
				max=arr[i];
				maxIndex=i;
			}
			if(min>=arr[i]) {
				min=arr[i];
				minIndex=i;
			}
			
		}
		
		if(maxIndex>minIndex) {
			System.out.println((maxIndex-1)+(n-minIndex)-1);
		}
		else  {
			System.out.println((maxIndex-1)+(n-minIndex));
		}
		
		
		 
	}
}
