package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1157
 * 단어 공부
 * @author minjung
 *
 */
public class baekjoon_1157 {
	
	private void solve(String word){
		word = word.toLowerCase(); // 소문자로 변환
		
		int[] ascii = new int[26]; // 입력받은 문자열 저장
		
		for( int i = 0; i < word.length(); i++ ){
			ascii[word.charAt(i) - 97]++; // 소문자 a는 97이므로 97을 빼면 a부터 차례대로 배열에 할당
		}
		
		int max = 0;
		boolean isMany = false; // 
		int result = 0; // 가장 많이 쓰인 알파벳의 아스키값 저장
		
		for( int i = 0; i < 26; i++ ){
			if ( max < ascii[i]) {
				result = i + 97;
				max = ascii[i];
				isMany = false;
			}
			else if( max == ascii[i] ) {
				isMany = true;
			}
		}
		
		if( isMany ) {
			System.out.println("?");
		}
		else {
			System.out.println((char)(result - 32)); // 아스키값을 대문자로 변환 후 출력
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc.init();
		
		String word = sc.readLine();
		new baekjoon_1157().solve(word);
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
