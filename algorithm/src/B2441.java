import java.util.Scanner;

public class B2441 {
/*첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제

하지만, 오른쪽을 기준으로 정렬한 별 (예제 참고)을 출력하시오.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
