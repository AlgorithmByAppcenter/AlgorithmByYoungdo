import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Queue mQueue = new LinkedList();
		int count = scan.nextInt();
		int i = 0, content;
		
		while(i<count){
			switch(scan.next()){
			case "push":
				content = scan.nextInt();
				mQueue.offer(content);
				break;
			case "pop":
				if(!mQueue.isEmpty()){
					System.out.println(mQueue.poll());
				} else{
					System.out.println("-1");
				}
				break;
			case "size":
				System.out.println(mQueue.size());
				break;
			case "empty":
				if(mQueue.isEmpty()){
					System.out.println("1");
				}else{
					System.out.println("0");
				}
				break;
			case "front":
				System.out.println(mQueue.peek());
				break;
			case "back":
				System.out.println(mQueue.toArray()[mQueue.size()-1]);
				break;
			default:
				break;
			}
			i++;
		}
	}
}
