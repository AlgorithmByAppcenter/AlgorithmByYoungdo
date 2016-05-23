import java.util.Scanner;

public class sumBinary {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int two = 1;
		int sum = 0;
		for(int i = 0; i < number; i++){
			two = two * 2;
		}
		for(int j = 0; j < two; j++){
			sum += j;
		}
		System.out.println(Integer.toBinaryString(sum));
		
	}
}
