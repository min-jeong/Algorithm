package dp;
import java.util.Scanner;

public class baekjoon_11052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt(); // 붕어빵 개수
		int[] price = new int[cnt]; // P1 부터 Pcnt까지 담을 배열
		
		for( int i = 0; i < cnt; i++ ){
			price[i] = sc.nextInt();
		}
		
		int[] cal = new int[cnt]; // 최대값 담을 배열
		cal[0] = price[0];
		
		for (int i = 1; i < cnt; i++ ){
			cal[i] = price[i];
			for( int j = 0; j < i; j++ ){
				int max = cal[i - j - 1] + price[j];
				cal[i] = Math.max(max, cal[i]);
			}
		}
		System.out.println(cal[cnt-1]);
	}
}

