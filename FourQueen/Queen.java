package fourQueen;

public class Queen {
	int n = 4;
	int arr[] = new int[n];

	public boolean test(int current) {
		for (int i = 0; i < current; i++) {
			if (arr[current] == arr[i]) {
				return false;
			}
			if ((current - i) == Math.abs(arr[current] - arr[i])) {
				return false;
			}
		}
		return true;
	}

	public void placeQueen() {
		for (int i = 0; i < 4; i++) {
			arr[0] = i;
			for (int j = 0; j < 4; j++) {
				arr[1] = j;
				if (test(1)) {
					for (int j2 = 0; j2 < 4; j2++) {
						arr[2] = j2;
						if (test(2)) {
							for (int k = 0; k < 4; k++) {
								arr[3] = k;
								if (test(3)) {
									showResult();
								}
							}
						}
					}
				}
			}
		}
	}

	public void showResult() {
		for (int i = 0; i < 4; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
