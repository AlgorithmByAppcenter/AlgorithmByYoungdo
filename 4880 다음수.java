import java.util.Scanner;

public class nextNum {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		int number[][] = new int[5][3];
		int AP = 0, GP = 0;
		int s = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				number[i][j] = scan.nextInt();
			}
			if(number[i][0] == 0 || number[i][2] == 0){
				s = i;
				break;
			}
		}
		int i = 0;
		while (i < s) {
			if ((number[i][1] - number[i][0]) == (number[i][2] - number[i][1])) {
				AP = number[i][2] + (number[i][1] - number[i][0]);
				System.out.println("AG "+AP);
			} else {
				GP = (number[i][1] / number[i][0]) * number[i][2];
				System.out.println("GP "+GP);
			}
			
			i++;
		}

	}
}
