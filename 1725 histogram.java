import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class histogram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int width = scan.nextInt();
		ArrayList<Integer> squre = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		ArrayList<Integer> area = new ArrayList<Integer>();
		for (int i = 0; i < width; i++) {
			squre.add(scan.nextInt());
		}
		int limit = 1;
		for (int i = 0; i < squre.size(); i++) {
			for (int z = i + 1; z <= squre.size(); z++) {
				for (int j = i; j < z; j++) {
					temp.add(squre.get(j));
					// System.out.println(j);
				}
				area.add(temp.size() * Collections.min(temp));
				temp.clear();
			}
		}
		System.out.println(Collections.max(area));
	}
}
//객체지향  - 시간줄이기