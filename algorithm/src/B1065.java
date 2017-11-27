import java.util.Scanner;

public class B1065 {
	/*
	 * 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을
	 * 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
	 *  ++추가설명 한수의 예 : 123, 642, 한자리수, 두자리수
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String s = String.valueOf(n);
		int[] arr = new int[s.length()];
		int count = 0;
		boolean b = false;

		if (s.length() == 1 || s.length() == 2)
			System.out.println(n);
		else {
			count = 99;
			for (int num = 100; num <= n; num++) {
				s = String.valueOf(num); // int to String
				for (int i = 0; i < s.length(); i++) {
					arr[i] = Integer.parseInt(s.substring(i, i + 1)); // substring(이 숫자 뒤부터, 이 숫자까지)
					if (i > 1) 
						if ((arr[i - 1] - arr[i - 2]) == (arr[i] - arr[i - 1]))
							b = true;
						else {
							b = false;
							break;
						}			
				}
				if (b == true)
					count++;
			}
			System.out.println(count);
		}
	}
	/*다른 사람꺼
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
	    int in = s.nextInt();
	    int n = 0;
	    for(int i=1; i<=in; i++){
          if(i==1000) break;
	      if(i<100) {
	        n++;
	      }
	      else if((i%10)-(i%100)/10 == (i%100)/10-(i%1000)/100){
	        n++;
	      }
	    }
	    System.out.print(n);
	}
	*/
}