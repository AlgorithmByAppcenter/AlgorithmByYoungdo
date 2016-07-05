import java.util.ArrayList;
import java.util.Scanner;

public class digitalTV {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<String> channel = new ArrayList<String>();
		String number = scan.nextLine();
		int current = 0;
		String temp = "";
		for(int i = 0; i<Integer.parseInt(number); i++){
			channel.add(scan.nextLine());
		}
		while(!(channel.get(0).equals("KBS1"))){
			if(!channel.get(current).equals("KBS1")){
				current++;
				System.out.print(1);
			}else{
				while(!(channel.get(0).equals("KBS1"))){
					temp = channel.get(current-1);
					channel.set(current-1, channel.get(current));
					channel.set(current, temp);
					current -= 1;
					System.out.print(4);
				}
			}
		}
		while(!(channel.get(1).equals("KBS2"))){
			if(!channel.get(current).equals("KBS2")){
				current++;
				System.out.print(1);
			}else{
				while(!(channel.get(1).equals("KBS2"))){
					temp = channel.get(current-1);
					channel.set(current-1, channel.get(current));
					channel.set(current, temp);
					current -= 1;
					System.out.print(4);
				}
			}
		}
	}
}
