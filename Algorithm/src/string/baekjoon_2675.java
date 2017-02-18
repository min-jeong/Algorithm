package string;
import java.util.Scanner;

public class baekjoon_2675 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int R;
		String S;
		
		
		for ( int i = 1; i <= T; i++ ){
			R = sc.nextInt();
			S = sc.next();
			
			String result = "";
			char arr[] = S.toCharArray();
			
			for( int j = 0; j < arr.length; j ++ ){
				for( int k = 1; k <= R; k++ ){
					result += arr[j];
				}
			}
			System.out.println(result);
		}
	}

}
