package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1475
 * 방 번호
 * @author minjung
 *
 */
public class baekjoon_1475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc.init();
		
		String num = sc.readLine();
		new baekjoon_1475().solve(num);
	}
	
	private void solve(String num) {
		int[] number = new int[10];
		
		for ( int i = 0; i < num.length(); i++ ){
			number[num.charAt(i)-48]++;
		}
		
		int max = 0;
		int index = 0;
		int result  = 0;
		
		for ( int i = 0; i < number.length; i ++ ){
			if ( max < number[i] ){
				max = number[i];
				index = i;
			}
		}
		
		if ( index == 9 || index == 6 ){
			result = (int) Math.round((double)(number[9] + number[6]) / 2);
			System.out.println(result);
		}
		else {
			System.out.println(max);
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
