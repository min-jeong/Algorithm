package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/10814
 * 나이순 정렬
 * @author minjung
 */
public class baekjoon_10814 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc.init();
		
		int num = sc.nextInt();
		new baekjoon_10814().solve(num);
	}

	private void solve(int num) {
		List<Member> member_list = new ArrayList<Member>();
		Member member;
		
		for( int i = 0; i < num; i++ ){ // List에 입력한 값 집어넣기
			int age = sc.nextInt();
			String name = sc.next();
			member = new Member(i, age,name); // i 는 입력 순서
			
			member_list.add(i, member);
		}
		
		Collections.sort(member_list);
	
		for ( Member mem : member_list ){
			System.out.println(mem);
		}
	}
	
	static class sc { 
		private static BufferedReader br;
		private static StringTokenizer st;
		
		static void init() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer("");
		}

		static String readLine() {
			try{
				return br.readLine();
			} catch (IOException e){
				e.printStackTrace();
			}
			return null;
		}
		
		static String next() {
			while (!st.hasMoreTokens() ){
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e){
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
		static long nextLong() {
			return Long.parseLong(next());
		}
		
		static int nextInt() {
			return Integer.parseInt(next());
		}
		
		static double nextDouble() {
			return Double.parseDouble(next());
		}
		
	}
	
	class Member implements Comparable<Object>{
		int token;
		int age;
		String name;
		
		public Member(int token, int age, String name){
			this.token = token;
			this.age = age;
			this.name = name;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}

		public int getToken() {
			return token;
		}

		public void setToken(int token) {
			this.token = token;
		}

		@Override
		public int compareTo(Object o) {
			Member member = (Member) o;
			if ( getAge() > member.age ) {
				return 1;
			}
			else if ( getAge() < member.age ){
				return -1;
			}
			else if ( getAge() == member.age ){
				if ( getToken() > member.token ){
					return 1;
				}
				else if ( getToken() < member.token ){
					return -1;
				}
				return 0;
			}
			return 0;
		}
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(getAge());
			sb.append(" ");
			sb.append(getName());
			
			return sb.toString();
		}
	
	}
	
}


