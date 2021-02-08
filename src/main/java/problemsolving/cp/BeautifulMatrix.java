package problemsolving.cp;

import java.util.Scanner;

public class BeautifulMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[5][5];
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j]=sc.nextInt();
				if(arr[i][j]==1) {
					System.out.println(Math.abs(i+1-3)+Math.abs(j+1-3));
				}
			}
		}
		

	}

}
