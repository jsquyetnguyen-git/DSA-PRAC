import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);

		System.out.print("Enter n:");
		int n = cs.nextInt();

		Queen q = new Queen(n);
		q.init(n);

	}

}
