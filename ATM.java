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
	    int tempValue; // 스왑 임시 저장소
	    if (start < end) {
	        i = start+1; // 양끝에서 접근할 값 정의
	        j = end;
	        p = num.get(start); // pivot을 맨 처음 값으로 설정
	        do {
	            while (num.get(i) < p){
	                i++; // pivot보다 크거나 같은 값 만날 때까지
	            };
	            while (num.get(j) > p) {
	                j--; // pivot보다 작거나 같은 값 만날 때까지
	            }
	            // 구한 i, j 인덱스의 값을 서로 스왑
	            if (i < j){
	                tempValue = num.get(j);
	                num.set(j, num.get(i));
	                num.set(i, tempValue);
	            }
	        } while (i < j); // i보다 j가 클때만 동작
	        num.set(start, num.get(j));
	        num.set(j, p);
	        // pivot값 프린트
	        quick_sort(num,start,j-1); // 왼쪽 편 같은 방법으로 sorting
	        quick_sort(num,j+1,end); // 오른쪽 편 같은 방법으로 sorting
	    }
	}
}
