import java.util.Scanner;

public class arrayStack {
	private static int top;
	private static int maxSize;
	private static Object[] stackArray;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String command;
		int i = 0;
		int content;
		maxSize = scan.nextInt();
		stackArray = new Object[maxSize];
		top = -1;

		while (i < maxSize) {
			command = scan.next();
			switch (command) {
			case "push":
				content = scan.nextInt();
				top += 1;
				stackArray[top] = content;
				break;
			case "pop":
				if (top != -1) {
					System.out.println(stackArray[top]);
					top -= 1;
				}else{
					System.out.println("-1");
				}
				break;
			case "size":
				System.out.println(top+1);
				break;
			case "empty":
				if(top == -1){
					System.out.println("1");
				}else{
					System.out.println("0");
				}
				break;
			case "top":
				if(top == -1){
					System.out.println("-1");
				}else{
					System.out.println(stackArray[top]);
				}
				break;
			default:
				break;
			}
			i++;

		}
	}

}
