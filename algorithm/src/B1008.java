import java.util.Scanner;

public class B1008 {
	/*A/B를 계산하시오.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double A, B;
		A = sc.nextInt();
		B = sc.nextInt();
		if (0 < A && 0 < B && A < 10 && B < 10)
			System.out.println(A/B);
	}
}
