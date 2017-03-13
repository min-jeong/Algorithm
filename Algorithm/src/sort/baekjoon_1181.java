package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1181
 * 단어 정렬
 * @author minjung
 *
 */
public class baekjoon_1181 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc.init();
		
		int n = sc.nextInt();
		new baekjoon_1181().solve(n);
		
	}

	private void solve(int n) {
		Set<String> word = new HashSet<String>(); // 중복요소를 저장하지 않는 컬랙션, 저장 순서 X
		// LinkedHashSet 을 사용해야 저장순서 유지 가능
		
		for ( int i = 0; i < n; i++ ){
			word.add(sc.readLine()); // 입력받은 값 저장
		}
		
		String[] wordArr = new String[word.size()];
		word.toArray(wordArr);
		
		Arrays.sort(wordArr, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
			
		});
		
		for (int i = 0; i < word.size(); i++ ){
			int len = wordArr[i].length();
			for ( int j = i+1; j < word.size(); j ++ ){
				int tmp = wordArr[j].length();
				if ( len != tmp ) { 
					break ;
				}
				Arrays.sort(wordArr, i, j);
				i = j - 1;
			}
			
		}
		for (int i = 0; i < word.size(); i++ ){
			System.out.println(wordArr[i]);
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
