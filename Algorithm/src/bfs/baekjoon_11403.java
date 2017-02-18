package bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_11403 {

	/**
	 * 무방향 그래프 인접행렬
	 * a[v1][v2] = 1;
	 * a[v2][v1] = 1;
	 * 
	 * 방향 그래프 인접행렬
	 * a[v1][v2] = 1;
	 * @param args
	 */
	
	private void solve() {
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		int[][] a = new int[n+1][n+1];
		int[] c = new int [n+1];
		int[][] path = new int[n+1][n+1];
		
		for (int i = 1; i <= n; i++ ){
			for(int j = 1; j <= n; j++ ){
				a[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 1; i <= n; i++ ){
			dfs(a, c, i);
			
			for (int j = 1; j <= n; j++ ){
				path[i][j] = c[j];
			}
			Arrays.fill(c, 0);
		}
		
		for (int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				sb.append(path[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	
	/**
	 * DFS
	 * 재귀, 인접행렬
	 * @param a
	 * @param c
	 * @param v
	 */
	public static void dfs(int[][] a, int[] c, int v){
		int n = a.length-1;
		
		for (int i = 1; i <= n; i++ ){
			if (a[v][i] == 1 && c[i] == 0){
				c[i] = 1;
				dfs(a, c, i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc.init();
		
		new baekjoon_11403().solve();
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
		
		static String readLineReplace() {
			try {
				return br.readLine().replaceAll("\\s+", "");
			} catch(IOException e){
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
