import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ABC {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	    ArrayList<Integer> number = new ArrayList();
	    HashMap map = new HashMap();
	    String st[] = new String[3];
		for(int i = 0; i < 3; i++){
			number.add(scan.nextInt());
		}
		number.sort(null);
		map.put("A", number.get(0));
		map.put("B", number.get(1));
		map.put("C", number.get(2));
		for(int i = 0; i <3;i++){
			st[i] = scan.next();
		}
		System.out.printf("%d %d %d",map.get(st[0]), map.get(st[1]), map.get(st[2]));
	}
}
