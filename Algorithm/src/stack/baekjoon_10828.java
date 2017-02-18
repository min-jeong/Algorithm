package stack;
import java.util.Scanner;
import java.util.Stack;

/**
 * 정수를 저장하는 스택을 구현한 다음, 
 * 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * @author minjeong
 *
 */
public class baekjoon_10828 {
	

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> s = new Stack<Integer>();
		
		int T = sc.nextInt();
		
		for( int i = 0; i <= T; i++ ){
			String str = sc.nextLine();
			
			if ( str.contains("push") ){
				int item = Integer.parseInt(str.substring(5, 6));
				s.push(item);
			}
			else if ( str.contains("pop") ){
				if ( s.isEmpty() ){
					System.out.println("-1");
				}
				else {
					System.out.println(s.peek());
					s.pop();
				}
			}
			else if ( str.contains("size") ){
				System.out.println(s.size());
			}
			else if ( str.contains("empty")) {
				if ( s.isEmpty() ){
					System.out.println("1");
				}
				else {
					System.out.println("0");
				}
			}
			else if ( str.contains("top")) {
				if ( s.isEmpty() ){
					System.out.println("-1");
				}
				else {
					System.out.println(s.peek());
				}
			}
		}

	}

}
