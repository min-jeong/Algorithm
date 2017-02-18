package math;

import java.util.Scanner;

public class baekjoon_2581 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int M = 0;
		int N = 0;
		
		while ( N <= M || M > 10000 || N > 10000) {
			M = sc.nextInt();
			N = sc.nextInt();
		}
		
		int sum = 0;
		int min = 0;
		int first = 0;
		
		boolean isPrime = true;
		
		if ( M == 1 ){
			M = 2;
		}
	
		for( int i = M; i <= N; i++ ){
			for ( int j = 2; j < i; j++) { //소수 찾기
				if( i == 2 ) {
					min = 2;
					sum += 2;
					first = 1;
					break;
				}
				
				if ( i%j == 0 ){
					isPrime = false;
					break;
				}
				
				else {
					isPrime = true;
				}
				
			}
			
			if ( isPrime && first == 0 ) { //최소값
				min = i;
				sum += i;
				first = 1;
			}
			
			else if( isPrime ){ //소수들의 합
				sum += i;
			}
		}
		
		if ( min == 0 ){
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
