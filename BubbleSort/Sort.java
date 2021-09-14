package BubbleSort;

import java.util.Arrays;

public class Sort {
	int[] arr;

	public Sort(int[] arr) {
		super();
		this.arr = arr;
	}

	public void BubbleSort() {
		int a[] = Arrays.copyOfRange(arr, 0, arr.length);

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("Bubble sort:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void SelectionSort() {
		int[] a = Arrays.copyOfRange(arr, 0, arr.length);

		for (int i = 0; i < a.length; i++) {
			int minIdx = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[minIdx]) {
					minIdx = j;
				}
			}
			int temp = a[i];
			a[i] = a[minIdx];
			a[minIdx] = temp;
		}
		System.out.println();
		System.out.print("Selection sort:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void InsertionSort() {
		int[] a = Arrays.copyOfRange(arr, 0, arr.length);

		for (int i = 0; i < a.length; i++) {
			int j = i - 1;
			int key = a[i];

			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
		System.out.println();
		System.out.print("Insertion sort:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
