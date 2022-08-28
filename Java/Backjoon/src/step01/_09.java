package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 김경준
 * 내용 : 불기년도를 서기년도로 변환하기
 */

public class _09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int Byear = sc.nextInt();
		
		int Syear = Byear - 543;
		
		System.out.println(Syear);
		
		
		
		
	}
}
