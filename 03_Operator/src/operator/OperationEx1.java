package operator;

public class OperationEx1 {

	public static void main(String[] args) {

		int mathScore = 90;
		int engScore = 70;
		int korScore = 40;

		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);

		double avgScore = totalScore / 3.0;
		System.out.println(avgScore);

		System.out.printf("%.2f\n", avgScore); // 소수점 2자리까지 잘라줌

	}

}
