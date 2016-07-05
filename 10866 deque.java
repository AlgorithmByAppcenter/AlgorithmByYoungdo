import java.util.ArrayDeque;
import java.util.Scanner;

public class AC {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		int number = scan.nextInt();
		int content = 0;
		for (int i = 0; i < number; i++) {
			switch (scan.next()) {
			case "push_front":
				content = scan.nextInt();
				deque.addFirst(content);
				break;
			case "push_back":
				content = scan.nextInt();
				deque.addLast(content);
				break;
			case "pop_front":
				if (!(deque.peekFirst() == null)) {
					System.out.println(deque.pollFirst());
				} else {
					System.out.println(-1);
				}
				break;
			case "pop_back":
				if (!(deque.peekLast() == null)) {
					System.out.println(deque.pollLast());
				} else {
					System.out.println(-1);
				}
				break;
			case "size":
				System.out.println(deque.size());
				break;
			case "empty":
				if (deque.peek() == null) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "front":
				if (!(deque.peekFirst() == null)) {
					System.out.println(deque.peekFirst());
				} else {
					System.out.println(-1);
				}
				break;
			case "back":
				if (!(deque.peekLast() == null)) {
					System.out.println(deque.peekLast());
				} else {
					System.out.println(-1);
				}
				break;
			default:
				break;

			}
		}
	}
}
