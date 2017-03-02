package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1032
 * 명령 프롬프트
 * @author minjung
 *
 */
public class baekjoon_1032 {

	private void solve(int n) {
		String file[] = new String[n];
		
		for( int i = 0; i < n; i++ ){
			
			file[i] = sc.readLine();
		}
		
		int size = file[0].length();
		
		String change = ""; // Char to String
		String result = ""; // 결과물

		boolean isOkay = true;
		
		for( int i = 0; i < size; i++ ){
			for ( int j = 0; j < file.length-1; j++ ){
				if ( file[j].charAt(i) == file[j+1].charAt(i) ){
					isOkay = true;
				}
				else{
					isOkay = false;
					break;
				}
				
			}
			if ( isOkay ){
				/**
				 * Char To String 
				 * 3가지 방법
				 */
				change = String.valueOf(file[0].charAt(i));
//				change = Character.toString(compare);
//				change = new Character(compare).toString();

				result = result.concat(change);
			}
			else {
				result = result.concat("?");
			}
		}
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc.init();
		
		int n = sc.nextInt();
		
		new baekjoon_1032().solve(n);
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
