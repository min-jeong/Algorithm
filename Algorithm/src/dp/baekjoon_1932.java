package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1932 {

	private void solve() {
		int n = sc.nextInt();
		int[][] dp = new int[n][n];
		
		// 2차원 배열에 담
		for ( int i = 0; i < n; i++ ){
			for (int j = 0; j <= i; j++) {
				dp[i][j] = sc.nextInt();
			}
		}
		
		for( int i = 1; i < n; i++ ){
			for ( int j = 0; j <= i; j++ ){
				if( j == 0) { // 왼쪽 끝일 경우 윗줄 왼쪽 끝
					dp[i][j] = dp[i][j] + dp[i-1][j];
				}
				else if ( j == i ){ // 오른쪽 끝일 경우 윗줄 오른쪽 끝
					dp[i][j] = dp[i][j] + dp[i-1][j-1];
				}
				else { // 오른쪽, 왼쪽 대각선 모두 비교
					dp[i][j] = Math.max(dp[i][j] + dp[i-1][j-1], dp[i][j] + dp[i-1][j]);
				}
			}
		}
		
		int max = 0;
		for( int i = 0; i < n; i++ ){
			/*for (int j = 0; j <= i; j++){
				System.out.print(dp[i][j] + " ");
			}
			System.out.println("");*/
			if ( max < dp[n-1][i] ){ // 마지막 줄에서 최대값 찾기
				max = dp[n-1][i];
			}
		}
		System.out.println(max);
	}
	
/*	private void solve2(){
		int n = sc.nextInt();
		int[][] dp = new int[n][n]; // 합
		int[][] num = new int[n][n]; // 삼각형
		
		int max = 0;
		
		// 2차원 배열에 담
		for ( int i = 0; i < n; i++ ){
			for (int j = 0; j <= i; j++) {
				num[i][j] = sc.nextInt();
			}
		}
		
		dp[0][0] = num[0][0];
		dp[1][0] = num[1][0] + num[0][0];
		dp[1][1] = num[1][1] + num[0][0];
		
		for( int i = 2; i < n; i++ ){
			for ( int j = 0; j <= i; j++ ){
				dp[i][j] = num[i][j] + Math.max(dp[i-1][j-1], dp[i-1][j]);
				if( i == n-1 ){
					if( j == 0){
						max = dp[i][j];
						max = Math.max(max, dp[i][j]);
					}
				}
			}
		}
		System.out.println(max);
	}
*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc.init();
		
		new baekjoon_1932().solve();

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
