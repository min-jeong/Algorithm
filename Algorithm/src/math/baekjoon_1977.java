package math;

import java.util.Scanner;

public class baekjoon_1977 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int sum = 0;
		int min = 0;
		int first = 0;
		
		for( int i = M; i <= N; i++ ){
			for( int j = 1; j <= 100; j++ ){
				if ( (j*j) == i && first == 0 ){
					sum += i;
					min = i;
					first = 1;
				}
				else if ( (j*j) == i && first == 1 ){
					sum += i;
				}
			}
		}
		if (min == 0){
			System.out.println("-1");
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
