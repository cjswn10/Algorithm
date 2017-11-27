import java.util.Scanner;

public class B2445 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= 2 * n; i++) {
			if (i <= n)
				for (int j = 1; j <= 2 * n; j++) {
					if ((j <= i) || (j > (2 * n - i)))
						System.out.print("*");
					else
						System.out.print(" ");
				}
			else
				for (int j = 1; j <= 2 * n; j++) {
					if ((j <= (2 * n - i)) || (j > i))
						System.out.print("*");
					else
						System.out.print(" ");
				}
			System.out.println();
		}
	}
}
