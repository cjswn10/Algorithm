import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 11, 77, 66, 33, 55, 22, 99, 88, 44 }; // 크기 9인 배열 선언
		selectionSort(num);
	}

	public static void selectionSort(int[] num) {
		int temp;
		int min;
		int index = 0;
		for (int i = 0; i < num.length; i++) {
			min = num[i];
			for (int j = i; j < num.length; j++)	//남은 배열 중 최솟값 찾기
				if (num[j] <= min) {
					min = num[j];
					index = j;
				}
			//최솟값과 위치변경
			temp = num[i];
			num[i] = min;
			num[index] = temp;
			System.out.println(num[i]);
		}
	}
}