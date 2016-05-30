import java.util.Scanner;

public class top {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] top = new int[N];
		int[] output = new int[N];
		for (int i = 0; i < N; i++) {
			top[i] = scan.nextInt();
		}
		int i = 0;
		for (int k = N - 1; k >= 0; k--) {
			for (int j = k - 1; j >= 0; j--) {
				if (top[j] > top[k]) {
					output[k] = j + 1;
					break;
				}
			}
		}
		System.out.printf("%d %d %d %d %d", output[0], output[1], output[2], output[3], output[4]);

	}
}
