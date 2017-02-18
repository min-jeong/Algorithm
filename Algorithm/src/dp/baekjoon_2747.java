package dp;
import java.util.Scanner;

public class baekjoon_2747 {
    public static int Fibonacci(int n) {
		int[] sequence = new int[46];
		sequence[0] = 0;
		sequence[1] = 1;

		for ( int i = 2; i <= n; i++ ){
			sequence[i] = sequence[i-1] + sequence[i-2];
		}
		return sequence[n];
	}
    
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(Fibonacci(n));
	}
}
