package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_9095 {

	private void solve() {
		int tc = sc.nextInt();
		
		int[] dp = new int[11];
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for( int i = 0; i < tc; i++ ) {
			int n = sc.nextInt();
			
			for ( int j = 4; j <= n; j++ ) {
				dp[j] = dp[j-3] + dp[j-2] + dp[j-1];
			}
			System.out.println(dp[n]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc.init();
		
		new baekjoon_9095().solve();
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
		
		static long nextLong() {
			return Long.parseLong(next());
		}
		
		static int nextInt() {
			return Integer.parseInt(next());
		}
		
		static double nextDouble() {
			return Double.parseDouble(next());
		}
		
	}
}
