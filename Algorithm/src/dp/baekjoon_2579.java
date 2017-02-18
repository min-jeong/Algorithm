package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/2579
 * 계단 오르기
 * @author minjung
 *
 */
public class baekjoon_2579 {
	
	private void stair(int n){
		int[] score = new int[n];
		
		//계단 점수 배열 생성
		for ( int i = 0; i < n; i++ ){
			score[i] = sc.nextInt();
		}
		
		int[] sumScore = new int[n];
		
		sumScore[0] = score[0];
		sumScore[1] = sumScore[0] + score[1];
		sumScore[2] = Math.max(sumScore[0] + score[2], score[1] + score[2]);
		
		for( int i = 3; i < n; i++ ){
			sumScore[i] = Math.max(sumScore[i-3] + score[i-1] + score[i], sumScore[i-2] + score[i]);
		}
		
		System.out.println(sumScore[n-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc.init();
		
		int n = sc.nextInt();
		
		new baekjoon_2579().stair(n);

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
