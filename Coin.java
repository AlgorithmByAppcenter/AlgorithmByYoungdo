import java.util.ArrayList;
import java.util.Scanner;

public class Coin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int money_total = scan.nextInt();
		int coinCount = 0;
		ArrayList<Integer> valueCoin = new ArrayList<Integer>();
		for (int i = 0; i < number; i++) {
			valueCoin.add(scan.nextInt());
		}
		for (int i = number - 1; i >= 0; i--) {
			if(money_total/valueCoin.get(i)>0){
				coinCount += money_total/valueCoin.get(i);
				money_total = money_total - (money_total/valueCoin.get(i))*valueCoin.get(i);
			}
		}
		System.out.println(coinCount);
	}
}
