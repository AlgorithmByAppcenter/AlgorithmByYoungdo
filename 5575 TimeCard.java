import java.util.Scanner;

public class TimeCard {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[6];
		int[] B = new int[6];
		int[] C = new int[6];
		for (int i = 0; i < 6; i++) {
			A[i] = scan.nextInt();
		}
		for (int i = 0; i < 6; i++) {
			B[i] = scan.nextInt();
		}
		for (int i = 0; i < 6; i++) {
			C[i] = scan.nextInt();
		}
		int a, b, c;
		c = A[5] - A[2];
		b = A[4] - A[1];
		a = A[3] - A[0];
		if (c < 0) {
			b = b - 1;
			c = c + 60;
		}
		if (b < 0) {
			a = a - 1;
			b = b + 60;
		}
		System.out.printf("%d %d %d\n", a, b, c);

		c = B[5] - B[2];
		b = B[4] - B[1];
		a = B[3] - B[0];
		if (c < 0) {
			b = b - 1;
			c = c + 60;
		}
		if (b < 0) {
			a = a - 1;
			b = b + 60;
		}
		System.out.printf("%d %d %d\n", a, b, c);

		c = C[5] - C[2];
		b = C[4] - C[1];
		a = C[3] - C[0];
		if (c < 0) {
			b = b - 1;
			c = c + 60;
		}
		if (b < 0) {
			a = a - 1;
			b = b + 60;
		}
		System.out.printf("%d %d %d", a, b, c);
	}
}
