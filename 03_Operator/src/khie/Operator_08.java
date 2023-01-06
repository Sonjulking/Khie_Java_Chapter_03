package khie;

public class Operator_08 {

	public static void main(String[] args) {

		// ★★run(위에 초록색 실행 버튼) 화살표 눌러서 -> 실행구성 -> 인수 -> 프로그램 인수에 값 입력★★
		// 키보드를 이용하여 두 개의 숫자를 입력을 받자.
		String su1 = args[0]; // 배열은 0번째가 첫번째임.
		String su2 = args[1];

		System.out.println("su1 + su2 >>> " + (su1 + su2));

		// 문자를 숫자로 바꾸기
		int num1 = Integer.parseInt(su1); // Integer라는 클래스의 parseInt()메서드 사용
		int num2 = Integer.parseInt(su2);

		System.out.println("num1 + num2 >>> " + (num1 + num2));

	}

}
