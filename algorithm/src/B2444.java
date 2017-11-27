import java.util.Scanner;

public class B2444 {
/*다이아몬드 별찍기*/
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
		
		a = 2*(n-1);
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < a; j++) 
				if (j <= i)
					System.out.print(" ");
				else
					System.out.print("*");

			System.out.println();
			a--;
		}
	}
}
