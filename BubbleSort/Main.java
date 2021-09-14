package BubbleSort;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.print("Enter n:");
		int n = cs.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("a[" + i + "]");
			arr[i] = cs.nextInt();
		}
		
		Sort sort = new Sort(arr);
		sort.BubbleSort();
		sort.SelectionSort();
		sort.InsertionSort();
		
		

	}

}
