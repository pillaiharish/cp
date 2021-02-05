package problemsolving.cp;

import java.util.Scanner;

public class GregsWorkout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr =new int[3];
		int max=0,maxIndex=0;
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			arr[i%3]=arr[i%3]+a;
			if(max<arr[i%3]) {
				max=arr[i%3];
				maxIndex=i;
			}
			
		}
		sc.close();
		if(maxIndex%3==0) {
			System.out.println("chest");
		}
		else if(maxIndex%3==1) {
			System.out.println("biceps");
		}
		else if(maxIndex%3==2) {
			System.out.println("back");
		}
		
	}

}
