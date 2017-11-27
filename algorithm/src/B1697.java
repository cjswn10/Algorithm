import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1697 {
	/*
	 * 수빈이는 동생과 숨바꼭질을 하고 있다. 수빈이는 현재 점 N(0 ≤ N ≤ 100,000)에 있고, 동생은 점 K(0 ≤ K ≤
	 * 100,000)에 있다. 수빈이는 걷거나 순간이동을 할 수 있다. 만약, 수빈이의 위치가 X일 때 걷는다면 1초 후에 X-1 또는
	 * X+1로 이동하게 된다. 순간이동을 하는 경우에는 1초 후에 2*X의 위치로 이동하게 된다.
	 * 수빈이와 동생의 위치가 주어졌을 때, 수빈이가 동생을 찾을 수 있는 가장 빠른 시간이 몇 초 후인지 구하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n, k; // n:수빈, k:동생
		n = scan.nextInt();
		k = scan.nextInt();


		System.out.println(BFS(n, k));
	}
	/*BFS를 이용하여 1을 더하고 뺏을때와 2배했을때의 경우의 수를 모두 탐색
	 * 큐를 이용하여 모든경우의 수를 큐에 넣고 하나씩 제거하며 */
	public static int BFS(int start, int end) {
		Queue<Integer> queue = new LinkedList<>();
		int[] time = new int[100001];	//수빈이 이동한 시간
		Arrays.fill(time,  -1);	//-1로 초기화
		queue.add(start);
		time[start] = 0;	//수빈위치 0초

		while(!queue.isEmpty()) {
			int current = queue.remove();	//큐에서 삭제하면서 current에 넣음
			if(current == end) {
				return time[current];	//이동시간(현재위치)반환
			}

			if ((current - 1) >= 0 && (time[current - 1] == -1)) { //time에 이미 초가 있을 경우 그게 최소 초이기 때문에 변경하지 않는다.
				time[current - 1] = time[current] + 1;	//다음 모든 이동 위치들의 시간을 변경
				queue.add(current - 1);					//큐에 다음 모든 이동 위치 추가
			}

			if ((current + 1) <= 100000 && (time[current + 1] == -1)) {
				time[current + 1] = time[current] + 1;	//다음 모든 이동 위치들의 시간을 변경
				queue.add(current + 1);					//큐에 다음 모든 이동 위치 추가
			}

			if ((current * 2) <= 100000 && (time[current * 2] == -1)) {
				time[current * 2] = time[current] + 1;	//다음 모든 이동 위치들의 시간을 변경
				queue.add(current * 2);					//큐에 다음 모든 이동 위치 추가
			}
		}
		return -1;
	}

}