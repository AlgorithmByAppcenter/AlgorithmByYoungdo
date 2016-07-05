import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		ArrayList<Integer> time = new ArrayList<Integer>();
		int number = scan.nextInt();
		for (int i = 0; i < number; i++) {
			time.add(scan.nextInt());
		}
		time.sort(null);
		//quick_sort(time, 0, number - 1);
		for (int i = 0; i < number; i++) {
			for (int j = number - 1; j >= i; j--) {
				sum = sum + time.get(i);
			}
		}
		System.out.println(sum);
	}
	static void quick_sort(ArrayList<Integer> num,int start, int end){
	    int i,j,p;
	    int tempValue; // ���� �ӽ� �����
	    if (start < end) {
	        i = start+1; // �糡���� ������ �� ����
	        j = end;
	        p = num.get(start); // pivot�� �� ó�� ������ ����
	        do {
	            while (num.get(i) < p){
	                i++; // pivot���� ũ�ų� ���� �� ���� ������
	            };
	            while (num.get(j) > p) {
	                j--; // pivot���� �۰ų� ���� �� ���� ������
	            }
	            // ���� i, j �ε����� ���� ���� ����
	            if (i < j){
	                tempValue = num.get(j);
	                num.set(j, num.get(i));
	                num.set(i, tempValue);
	            }
	        } while (i < j); // i���� j�� Ŭ���� ����
	        num.set(start, num.get(j));
	        num.set(j, p);
	        // pivot�� ����Ʈ
	        quick_sort(num,start,j-1); // ���� �� ���� ������� sorting
	        quick_sort(num,j+1,end); // ������ �� ���� ������� sorting
	    }
	}
}
