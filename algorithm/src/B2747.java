import java.util.Scanner;

public class B2747 {
	//Fibonacci 구하기 
	//Fibo(n) = Fibo(n-1) + Fibo(n-2) =>재귀함수는 실행 시간이 너무 김
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] Fibonacci = new int[n+1];
		
		for(int i = 0; i <= n; i++) {
			if(i >= 2) {
				Fibonacci[i] = Fibonacci[i-1] + Fibonacci[i-2];
			} else
				Fibonacci[i] = i;
		}
		System.out.println(Fibonacci[n]);
	}

}
