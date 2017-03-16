package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/5052
 * 전화번호 목록
 * @author minjung
 *
 */
public class baekjoon_5052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc.init();
		
		int tc = sc.nextInt();
		boolean isOkay[] = new boolean[tc];
		for ( int i = 0; i < tc; i++ ){
			int num = sc.nextInt();
			isOkay[i] = new baekjoon_5052().solve(num);
		}
		
		for ( int i = 0; i < tc; i++ ){
			if(isOkay[i]){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

	private boolean solve(int num) {
		String[] tel = new String[num]; // 전화번호 담을 배열
		
		boolean isConsistency = true;
		for ( int i = 0; i < num; i++ ){ // num만큼 배열에 전화번호를 담는다.
			
			String number = sc.readLine();
			
			if ( number.length() < 11 ){
				tel[i] = number;
			}
			else{
				while ( number.length() > 10 ){
					System.out.println("10자리 이하 입력해주세요.");
					number = sc.readLine();
				}
				tel[i] = number;
			}
		}
		Arrays.sort(tel, new Comparator<String>(){ // 길이가 짧은 순서로 정렬

			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		});
		
		for ( int i = 0; i < tel.length/2; i++ ){ //기준
			for (int j = i+1; j < tel.length; j++ ){ // 비교대상
				if ( tel[j].substring(0, tel[i].length()).equals(tel[i]) ){
					isConsistency = false;
					break;
				}
				else {
					isConsistency = true;
				}
			}
			if( !isConsistency ){
				break;
			}
		}
		return isConsistency;
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
