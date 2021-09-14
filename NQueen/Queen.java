public class Queen {

	int n;

	public Queen(int n) {
		this.n = n;
	}

	public void init(int n) {
		int arr[] = new int[n];
		placeQueen(arr, 0);
	}

	public boolean test(int arr[], int current) {
		for (int i = 0; i < current; i++) {
			// check row
			if (arr[current] == arr[i]) {
				return false;
			}
			// check diagonal
			if ((current - i) == Math.abs(arr[current] - arr[i])) {
				return false;
			}
		}
		return true;
	}

	public void placeQueen(int arr[], int current) {
		if (current == n) {
			showResult(arr);
			return;
		}

		for (int i = 0; i < n; i++) {
			arr[current] = i;
			if (test(arr, current)) {
				placeQueen(arr, current + 1);
			}
		}
	}

	public void showResult(int arr[]) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
