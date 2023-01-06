package khie;

/*
 * 7.쉬프트 연산자
 * 	-비트를 대상으로 왼쪽 / 오른쪽으로 비트를 밀어서 연산을 수행하는 연산자.
 *  -왼쪽 쉬프트(<<) : 왼쪽으로 비트 수 만큼 이동하는 연산자. 오른쪽에 비어 있는 빈칸(비트)은 0으로 채워진다.
 *  -부호 있는 오른쪽 쉬프트(>>) : 오른쪽으로 비트수만큼 이동하는 연산자. 왼쪽에 비어있는 빈 칸(비트)은 부호비트로 채워짐.
 *  -부호 없는 오른쪽 쉬프트(>>>) : 오른쪽으로 비트수만큼 이동하는 연산자. 왼쪽에 비어있는 빈 칸(비트)은 0으로 채워짐.// 그럼 무조건 양수로만 되겠죠?
 *  //자바에만 있는 연산자임
 */
public class Operator_07 {

	public static void main(String[] args) {

		int num1 = 10, num2 = 5;
		// 십진수를 이진수로 변환.
		// num1 = 1010, num2 = 0101;

		System.out.println(num1 << 2); // 1010 -> 101000
		System.out.println();

		System.out.println(num2 >> 1); // 0101 -> 0010

		System.out.println("----");
		System.out.println(num1 >> 2);
		System.out.println(num2 >> 2);
		System.out.println("----");
		System.out.println(num1 >>> 2);
		System.out.println(num2 >>> 2);

	}

}
