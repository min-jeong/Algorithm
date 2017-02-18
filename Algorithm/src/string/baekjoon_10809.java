package string;
import java.util.Scanner;

public class baekjoon_10809 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		for ( String a : alpha ){
			System.out.print(S.indexOf(a) + " ");
		}
	}

}
