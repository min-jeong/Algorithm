package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1699
 * 제곱수의 합
 * @author minjung
 */
public class baekjoon_1699 {
	
	private void solve(int n) {
		int dp[] = new int[100001];
		
		for ( int i = 1; i <= n; i++ ){
			dp[i] = i; // N을 1*1로 표현 했을 경우로 초기화
			for( int j = 1; j*j <= i; j++ ){
				dp[i] = Math.min(dp[i], dp[i-j*j] + 1); // 항의 개수 +1 을 해줘야 한다.
			}
		}
		System.out.println(dp[n]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc.init();
		
		int n = sc.nextInt();
		new baekjoon_1699().solve(n);
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
