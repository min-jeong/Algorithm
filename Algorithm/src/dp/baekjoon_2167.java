package dp;

import java.util.Scanner;

public class baekjoon_2167 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//배열 크기 입력받아서 이차원 크기의 배열 생성
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int[][] arr = new int[row][col];
		
		// x의 크기 만큼 입력 받아 배열에 넣기
		for ( int q = 0; q < row; q++ ){
			
			for( int w = 0; w < col; w++ ){
				arr[q][w] = sc.nextInt();
			}
		}
		
		int k = sc.nextInt();
		int i, j, x, y = 0;
		int[] sum = new int[k];
		
		for( int q = 0; q < k; q++){
			i = sc.nextInt();
			j = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			
			int sumtest= 0;
			for ( int w = i-1; w <= x-1; w++ ){
				for ( int e = j-1; e <= y-1; e++ ){
					sumtest += arr[w][e];
				}
			}
			sum[q] = sumtest;
		}
		
		for( int num : sum) {
			System.out.println(num);
		}
	}
	
}

