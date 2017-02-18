package dp;

import java.util.Scanner;

public class baekjoon_1463 {
	static int[] cal;
	private static Scanner scanner = new Scanner(System.in);
	
	public static int check(int number){
		if (number == 1){
			return 0;
		}
		
		for(int i = 2; i <= number; i++ ){
			cal[i] = cal[i-1] + 1;
			if(i%3 == 0 && cal[i/3] + 1 < cal[i]){
				cal[i] = cal[i/3] + 1;
			}
			if(i%2 == 0 && cal[i/2]+1 < cal[i]){
				cal[i] = cal[i/2] + 1;
			}
		}
		
		return cal[number];
		
	}
	
	public static void main(String[] args) {
		int number = Integer.parseInt(scanner.nextLine());
		
		cal = new int[number+1];
		cal[1] = 0;
		
		System.out.println(check(number));
	}
}

