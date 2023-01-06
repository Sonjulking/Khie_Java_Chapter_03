package khie;
/*
 * 4.단항 연산자 / 2항 연산자 / 3항 연산자 
 * 		-단항 연산자 : 1개의 항을 대상으로 연산을 수행.
 *		-3항 연산자 : 3개의 항을 대상으로 연산을 수행. 
 */

public class Operator_04 {

	public static void main(String[] args) {

		// 단항 연산자(++, --)
		int su1 = 10, su2 = 10;
		System.out.println("su1++ >>> " + su1++); // 코드가 실행한 다음에 값이 1 증가됌
		System.out.println("++su2 >>> " + ++su2); // 코드를 실행하기전 값을 1 증가시켜줌

		/*
		 * 
		 * 단항 연산자(++, --)
		 * 
		 * -전위 연산자 : 단항 연산자가 변수명 앞에 온다. 변수의 값을 하나 증가 또는 감소 시킨후 처리한다.(++su2)
		 * 
		 * -후위 연산자 : 단항 연산자가 변수명 뒤에 온다.변수를 처리한 후 값을 하나 증가 또는 감소시킨다.(su1++)
		 * 
		 */

		int su3 = 10, su4 = 20;

		System.out.println(++su3 + su4++); // 11 + 20
		System.out.println();

		System.out.println((++su3 % 3) + (su3 * ++su4)); // 0 + 264

		/*
		 * 3항 연산자
		 * 
		 * 형식) (조건) ? 수식1 : 수식2;
		 * 
		 * ==> 수식1 : 조건이 참인 경우 실행 문장.
		 * 
		 * ==> 수식2 : 조건이 거짓인 경우 실행 문장
		 * 
		 * -간단하게 조건문을 대신하여 사용할 수 있는 연산자
		 */

		int num1 = 45, num2 = 23;

		String result = (num1 > num2) ? "num1 값이 크다" : "num2 값이 크다."; // String 문자열을 저장하는 자료형

		System.out.println(result);

		String result2 = (num1 < num2) ? "num1 값이 크다" : "num2 값이 크다."; // String 문자열을 저장하는 자료형

		System.out.println(result2);
	}

}
