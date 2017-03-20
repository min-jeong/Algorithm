package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/2399
 * 거리의 차이
 * @author minjung
 */
public class baekjoon_2399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc.init();
		
		int n = sc.nextInt();
		new baekjoon_2399().solve(n);
	}
	
	private void solve(int n) {
		int[] x = new int[n];
		
		for ( int i = 0; i < n; i++ ){
			x[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < n; i++ ){
			for ( int j = 0; j < n; j++ ){
				sum = sum + Math.abs(x[i] - x[j]);
			}
		}
		
		System.out.println(sum);
	}

	static class sc { 
		private static BufferedReader br;
		private static StringTokenizer st;
		
		static void init() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer("");
		}
		
		static String readLine() {
			try{
				return br.readLine();
			} catch (IOException e){
				e.printStackTrace();
			}
			return null;
		}
		
		static String next() {
			while (!st.hasMoreTokens() ){
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e){
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
		static int nextInt() {
			return Integer.parseInt(next());
		}
		
	}

}
