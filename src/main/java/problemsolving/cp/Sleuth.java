package problemsolving.cp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// Sleuth
// https://codeforces.com/contest/49/problem/A
public class Sleuth {
	public static void solve(String s) {
		char inside = 0;
		for(int i=s.length()-1;i>=0;i--) {
			
			if(s.charAt(i)!=' ' && s.charAt(i)!='?') {
				inside=s.charAt(i);
				break;
			}
			

		}
		inside=Character.toLowerCase(inside);
		if(inside=='a'||inside=='e'||inside=='i'||inside=='o'||inside=='u'||inside=='y') {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		solve(s);
	}
    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }

}
