package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/3649
 * 로봇 프로젝트
 * @author minjung
 */
public class baekjoon_3649 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc.init();
		String size = "";
		while ( (size = sc.readLine()) != null ){
			int size1 = Integer.parseInt(size);
			new baekjoon_3649().solve(size1);
		}
	}
	
	private void solve(int size) {
		
		int legoNum = sc.nextInt(); // 레고의 갯수
		int[] legoSize = new int[legoNum]; // 여러 크기의 레고를 담을 배열
		
		for( int i = 0; i < legoNum; i++ ){
			legoSize[i] = sc.nextInt();
		}
		
		size = size * 10000000; // 나노미터로 변경
		Arrays.sort(legoSize);

		int l1 = 0;
		int l2 = 0;
		boolean isOkay = false;
		
		int flagL = 0;
		int flagR = legoNum-1;
		
		int sum = 0;
		while ( flagL < flagR ){
			sum = legoSize[flagL] + legoSize[flagR];
			
			if( sum == size ) {
				l1 = legoSize[flagL];
				l2 = legoSize[flagR];
				isOkay = true;
				break;
			}
			else if ( sum < size ){
				flagL++;
			}
			else if ( sum > size ){
				flagR--;
			}
		}
		
		if ( l1 != 0 && l2 != 0) {
			System.out.printf("yes %d %d\n", l1, l2);
		}
		else {
			System.out.printf("danger\n");
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
		
		static int nextInt() {
			return Integer.parseInt(next());
		}
		
	}
}
