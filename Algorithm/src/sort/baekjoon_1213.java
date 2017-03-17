package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1213
 * 팰린드롬 만들기
 * @author minjung
 */
public class baekjoon_1213 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc.init();
		
		String name = sc.readLine();
		
		new baekjoon_1213().solve(name);
	}
	
	private void solve(String name) {
		// TODO Auto-generated method stub
		int size = name.length();
		char[] sort = new char[size];
		int[] cnt = new int[27];
		
		sort = name.toCharArray();
		Arrays.sort(sort);
		
		for (int i = 0; i< size; i++ ){
			cnt[sort[i] -'A']++;		
		}
		
		// 팰린드롬이 가능한지 체크
		int isOkay = 0;
		for ( int i = 0; i < 26; i++ ){
			isOkay = isOkay + cnt[i]%2;
		}
		
		if ( (size%2 == 0 && isOkay != 0) || (size%2 != 0 && isOkay == 0)) {
			// 팰린드롬이 가능하지 않은 경우
			System.out.println("I'm Sorry Hansoo");
		}
		
		String result = ""; // 결과값 담을 변수
		int index = 0; // 중간에 들어갈 알파벳
		for ( int i = 0; i < 26; i++ ){
			if (cnt[i]%2 == 1){ 
				index = i; // 홀수개인 알파벳의 인덱스를 담는다.
			}
		}
		
		for ( int i = 0; i < 26; i++ ){
			cnt[i] = cnt[i]/2;
		}
		for ( int i = 0; i < 26; i++ ){
			for ( int j = 0; j < cnt[i]; j++ ){
				result = result + (char)(i+'A');
			}
		}
		
		if (size%2 != 0) {
			result = result + (index + 'A');
		}
		for ( int i = 25; i >= 0; i-- ){
			for ( int j = 0; j < cnt[i]; j++ ){
				result = result +(char)(i+'A');
			}
		}
		
		System.out.println(result);
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
