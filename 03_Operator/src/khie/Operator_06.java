package khie;
/*
 * 6. 비트연산자 
 * -비트(0,1)를 이용하여 연산하는 연산자.
 * - &(and) : 두 비트의 조건이 참(1)인 경우 1을 반환. 그 외에는 0을 반환.
 * - |(or) : 두 비트 중 하나만 조건이 참(1)인 경우 1을 반환. 그 외에는 0을 반환.
 * - ^(xor) : 두 비트중 서로 다른 경우에만 참(1)을 반환. 그 외에는 0을 반환.  (두개가 같으면 거짓 다르면 참)
 * 
 * -비트 연산을 하기 위해서는 십진수를 이진수로 변환하는 과정이 필요하다.(0,1을 사용하기 때문에)
 */

public class Operator_06 {

	public static void main(String[] args) {

		int num1 = 10, num2 = 5, result;

		// 비트 연산을 하기위해서는 십진수를 이진수로 변환 해야 된다.
		// num1 = 1010, num2 = 0101

		// and 연산
		result = num1 & num2; // 1010 & 0101 ==> 0000
		System.out.println("and result >>> " + result);
		System.out.println();

		// or 연산
		result = num1 | num2; // 1010 | 0101 ==> 1111
		System.out.println("or result >>> " + result);
		System.out.println();

		// xor 연산
		result = num1 ^ num2; // 1010 ^ 0101 ==> 1111
		System.out.println("xor result >>> " + result);
		System.out.println();

	}

}
