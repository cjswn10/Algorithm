import java.util.*;

public class B1003 {
	/*fibonacci(N)을 호출했을 때, fibonacci(0)과 fibonacci(1)이 각각 몇 번 출력되는지 구하는 프로그램
     * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 구성되어있다.
     * 각 줄에 N이 주어진다. N은 40보다 작거나 같은 자연수 또는 0이다.
    */
	static int j = 0;
	static int k = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < t; i++) {
			int a = scan.nextInt();
			if ( a <= 40 && a >=0)
				list.add(a);
		}

		for (int n : list) {
			fibonacci(n);
			System.out.println(j + " " + k);
			j = 0;
			k = 0;
		}
	}

	static int fibonacci(int n) {
		if (n == 0) {
			j++;
			return 0;
		} else if (n == 1) {
			k++;
			return 1;
		} else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
}


