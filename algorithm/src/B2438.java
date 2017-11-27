import java.util.Scanner;

public class B2438 {
/*첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
