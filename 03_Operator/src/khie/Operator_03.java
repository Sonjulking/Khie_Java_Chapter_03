package khie;
/*
 * 3. 논리연산자 
 *		-논리곱(&&) and : 주어진 조건이 모두 참인 경우에만 결과가 true가 된다. 나머지는 모두 false가 된다.
 *		-논리합(||) or : 주어진 조건 중에 하나라도 참이면 결과는 true가 된다. 그 나머지는 모두 false가 된다.
 *		-부정(!) not : true -> false, false -> true가 된다.
 *
 *=>★★관계 연산자가 우선순위가 된다. 왜냐면 관계연산자에서 true false 이렇게 나온 결과값으로 값을 구해야 되기 떄문임!★★★
 */

public class Operator_03 {

	public static void main(String[] args) {

		int su1 = 10, su2 = 7;

		// 논리곱인 경우 : true && true ==> true
		boolean test = (su1 >= su2) && (su1 >= 5);
		System.out.println("test 결과 >>> " + test);
		System.out.println();

		// 논리곱인 경우 : true && false
		test = (su1 >= su2) && (su1 <= 5);
		System.out.println("test 결과 >>> " + test);
		System.out.println();

		// 논리합인 경우 : true || true ==> true
		test = (su1 >= su2) || (su1 >= 5);
		System.out.println("test 결과 >>> " + test);
		System.out.println();

		// 논리합인 경우 : true || false ==> true
		test = (su1 >= su2) || (su1 <= 5);
		System.out.println("test 결과 >>> " + test);
		System.out.println();

		// 단락 회로 평가
		// 논리 곱인 경우 앞에가 false면 뒤에를 계산안하고 논리 합인 경우 앞에가 true면은 뒤에를 계산 안한다.

	}

}
