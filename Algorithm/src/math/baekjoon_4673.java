package math;

public class baekjoon_4673 {
	public static void main(String[] args) {
		//숫자 1부터 10000까지 담기
		int[] bucket = new int[10001];
		
		for(int i = 0; i < 10001; i++){
			bucket[i] = i;
		}
		
		// i를 생성자로 갖는 수를 담을 값
		int result = 0;
		
		for (int i = 1; i < 10001; i++){
			result = sumOfValue(i);
			if( result > 10000 ) {
				continue;
			}
			else {
				bucket[result] = -1;
			}
		}
		
		for (int i = 1; i < 10000; i++ ) {
			if(bucket[i] != -1){
				System.out.println(bucket[i]);
			}
				
		}
	}
	
	public static int sumOfValue(int number){
		// 각 자리수를 더하는 함수, 수열의 다음 값 
		int NewNum = number + number/1000 + (number/100)%10 + (number/10)%10 + number%10;
		
		return NewNum;
	}
}
