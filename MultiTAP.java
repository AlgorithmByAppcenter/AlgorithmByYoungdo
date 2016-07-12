import java.util.Scanner;

public class MultiTAP {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int time = scan.nextInt();
		int count = 0, temp = 0;
		boolean ok = true;
		int[] multi = new int[size];
		for (int i = 0; i < time; i++) {
			if (i < size) {
				temp = scan.nextInt();
				for (int j = 0; j < i; j++) {
					if (multi[j] == temp) {
						ok = false;
					}
				}
				if (ok) {
					multi[i] = temp;
				}
				ok = true;
			} else {
				temp = scan.nextInt();
				for (int j = 0; j < size; j++) {
					if (multi[j] == temp) {
						ok = false;
					}
				}
				if (ok) {
					multi[max(multi)] = temp;
					count++;
				}
				ok = true;
			}
		}
		System.out.println(count);
	}

	public static int max(int[] multi) {
		int temp = multi[0];
		int index = 0;
		for (int i = 0; i < multi.length; i++) {
			if (multi[i] > temp) {
				temp = multi[i];
				index = i;
			}
		}
		return index;
	}
}
