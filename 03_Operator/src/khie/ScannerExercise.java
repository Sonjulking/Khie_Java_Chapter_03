package khie;

import java.util.Scanner;

public class ScannerExercise {

	public static void main(String[] args) {
		int number1;
		Scanner sc = new Scanner(System.in); // 스캐너 라는 클래스(붕어빵틀) sc 라는 인스턴스를 new 라는 키워드를 이용해서 생성
		System.out.println("입력해봐용");
		number1 = sc.nextInt();
		System.out.println(number1);

		// Scanner를 이용하면 반드시 종료를 시키자.
		sc.close();

		// in.nextByte() // byte 형 입력 및 리턴
		// in.nextShort() // short 형 입력 및 리턴
		// in.nextInt() // int 형 입력 및 리턴
		// in.nextLong() // long 형 입력 및 리턴
		//
		// in.nextFloat() // float 형 입력 및 리턴
		// in.nextDouble() // double 형 입력 및 리턴
		//
		// in.nextBoolean() // boolean 형 입력 및 리턴
		//
		// in.next() // String 형 입력 및 리턴 (공백을 기준으로 한 단어를 읽음)
		// in.nextLine() // String 형 입력 및 리턴 (개행을 기준으로 한 줄을 읽음)
	}

}
