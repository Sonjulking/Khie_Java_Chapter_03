package khie;

/*
 * 연산 : 주어진 식을 계산하여 결과를 얻어내는 과정
 * -피연산자 : 연산자의 작업 대상
 * (예 : 20 + 10 ==> 20, 10 을 피연산자라고 함)
 * -java에서 연산자의 종류 
 * 1.산술 연산자
 * 2.관계 연산자(비교 연산자)
 * 3.논리 연산자
 * 4.단항 연산자 / 3항 연산자
 * 5.배정 연산자 (대입 연산자) / 단축 배정 연산자 (복합 대입 연산자) 
 * 6.비트 연산자 
 * 7.쉬프트 연산자 
 */

/*
 * 1.산술 연산자
 * 		- 덧셈(+), 뺄셈(-), 곱셈(*), 나눗셈(/), 나머지(%)
 */

public class Operator_01 {

	public static void main(String[] args) {

		int su1 = 10, su2 = 4;

		// 덧셈연산
		System.out.println("덧셈결과 >>> " + (su1 + su2));
		System.out.println();

		// 뺄셈 연산
		System.out.println("뺄셈결과 >>> " + (su1 - su2));
		System.out.println();

		// 곱셈 연산
		System.out.println("곱셈결과 >>> " + (su1 * su2));
		System.out.println();

		// 나눗셈 연산
		System.out.println("나눗셈 결과(몫) >>> " + (su1 / su2));
		System.out.println();

		// 나머지 연산
		System.out.println("나머지 결과 >>> " + (su1 % su2));

		// 나머지(%) 연산자
		// 나머지를 구하는 연산자
		// 홀수 짝수 구할때 많이 사용함.
		// 배수판별시에도 사용함

	}

}
