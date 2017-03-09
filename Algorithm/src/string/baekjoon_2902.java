package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/2902
 * KMP는 왜 KMP일까?
 * @author minjung
 *
 */
public class baekjoon_2902 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc.init();
		
		String longName = sc.readLine();
		new baekjoon_2902().solve(longName);
	}
	

	private void solve(String longName) {
		System.out.print(longName.charAt(0)); // 첫글자 출력
		
		for( int i = 1; i < longName.length(); i ++ ){ // 첫 글자 이후 for문 돌면서
			if ( longName.charAt(i) == 45 ){ // '-'하이픈 다음대문자 출력('-'아스키코드 45)
				System.out.print(longName.charAt(i+1));
			}
		}
		
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
