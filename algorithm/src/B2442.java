import java.util.Scanner;

public class B2442 {
/*첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2*N-1개를 찍는 문제

별은 가운데를 기준으로 대칭이어야 한다.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = n;
		for(int i = (n-1); i > -1; i--) {
			for(int j = 0; j < a; j++) 
				if (j < i)
					System.out.print(" ");
				else
					System.out.print("*");

			System.out.println();
			a++;
		}
	}
}
