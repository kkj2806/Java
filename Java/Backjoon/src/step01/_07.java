package step01;

import java.util.Scanner;

/* 날짜 : 2022/08/19
 * 이름 : 김경준
 * 내용 : 1단계 7번 : 사칙연산
 */

public class _07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int min = num1 - num2;
		int mul = num1 * num2;
		int x = num1 / num2;
		int y = num1 % num2;
		
		System.out.println(sum);
		System.out.println(min);
		System.out.println(mul);
		System.out.println(x);
		System.out.println(y);
		
	}
}
