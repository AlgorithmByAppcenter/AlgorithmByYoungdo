import java.util.ArrayList;
import java.util.Scanner;

public class bandochea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> port = new ArrayList<Integer>();
		ArrayList<Integer> Lower_bound = new ArrayList<Integer>();
		int number = scan.nextInt();
		int size = 0, count = 0;
		for (int i = 0; i < number; i++) {
			port.add(scan.nextInt());
		}
		Lower_bound.add(port.get(0));
		for (int i = 1; i < number; i++) {

			if (Lower_bound.get(size) < port.get(i)) {
				Lower_bound.add(port.get(i));
				size++;

			}
			if (Lower_bound.get(size) > port.get(i)) {
				Lower_bound.set(size, port.get(i));
				for (int j = 1; j < size; j++) {
					if (Lower_bound.get(size - j) > port.get(i))
						Lower_bound.remove(size - j);
						count++;
				}
				size = size - count;
				count = 0;
			
			}
		
		}
		System.out.println(Lower_bound);
	}

}
