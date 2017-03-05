package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/10988
 * 팰린드롬인지 확인하기
 * @author minjung
 */
public class baekjoon_10988 {

	private void solve(String word) {
		int length = word.length();
		
		boolean isPalindrome = true;
		
		for( int i = 0; i < length/2; i++ ) { // 0부터 단어의 중간까지
			if (word.charAt(i) == word.charAt(length-i-1)) {
				isPalindrome = true;
			}
			else { // 다른 부분을 발견한다면, isPalindrome은 false로 바꿔주고 for 문을 빠져나간다.
				isPalindrome = false;
				break;
			}
		}
		
		if (isPalindrome){
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc.init();
		
		String word = sc.readLine();
		new baekjoon_10988().solve(word);
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
