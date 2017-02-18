package search;
import java.util.Scanner;

public class baekjoon_1065 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int cnt = 0;
		for ( int i = 1; i <= N; i++ ){
			if ( i < 100 ){
				cnt++;
			}
			else if ( i >= 100 ){
				int X = i / 100;
				int Y = i % 100 / 10;
				int Z = i % 10;
				if ( X-Y == Y-Z ){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
