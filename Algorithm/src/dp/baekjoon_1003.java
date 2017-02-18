package dp;

import java.util.Scanner;

public class baekjoon_1003 {
	static int checkZero = 0;
	static int checkOne = 0;
	
	private Scanner scanner = new Scanner(System.in);
	
	private int inputCaseCnt() {
		int caseCnt = Integer.parseInt(scanner.nextLine());
		return caseCnt;
	}
	
	private int inputNumber() {
		int input = Integer.parseInt(scanner.nextLine());
		return input;
	}
	
	public void start() {
		int caseCnt = inputCaseCnt();
		int number[] = new int[caseCnt];
		
		for(int i = 0; i < caseCnt; i++){
			number[i] = inputNumber();
		}
		for(int i = 0; i < number.length; i++){
			fibonacci(number[i]);
			System.out.println(checkZero + " " + checkOne);
			checkZero = 0;
			checkOne = 0;
		}
	}
	
	public static int fibonacci( int n ){
		
		if( n == 0 ){
			checkZero++;
			return 0;
		}
		else if ( n == 1 ){
			checkOne++;
			return 1;
		}
		else { 
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new baekjoon_1003().start();
	}

}
