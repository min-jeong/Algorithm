package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * DFS 사용
 * @author minjung
 *
 */
public class baekjoon_2583_X {

	private  void solve() {
		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[][] table = new int[n][m]; // 직사각형
		boolean[][] visited = new boolean[n][m];
		
		for( int i = 1; i <= k; i++ ){
			int lx = sc.nextInt(); // 왼쪽 아래 x좌표
			int ly = sc.nextInt(); // 왼쪽 아래 y좌표
			int rx = sc.nextInt(); // 오른쪽 위 x 좌표
			int ry = sc.nextInt(); // 오른쪽 위 y 좌표
			
			table = fill(ly, lx, ry - ly, rx - lx, table); // 채우
		}
		
	}
	
	/**
	 * 칸 채우는 함수
	 * @param args
	 */
	public int[][] fill (int yStart, int xStart, int height, int width, int[][] table){
		for ( int y = yStart; y < yStart + height; y++ ){
			for ( int x = xStart; x < xStart + width; x++ ){
				table[y][x] = 1;
			}
		}
		return table;
	}
	
	public int[][] init(int m, int n, int[][] table) {
		for(int y = 0; y < m; y++){
			for( int x = 0; x < n; x++){
				table[y][x] = 0;
			}
		}
		return table;
	}
	
	/**
	 * 칸 세는 함수 
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
				
			}
			return null;
		}
		
		static String readLineReplace() {
			try {
				return br.readLine().replaceAll("\\s+", "");
			} catch(IOException e){
			}
			return null;
		}
		
		static String next() {
			while (!st.hasMoreTokens() ){
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e){
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
