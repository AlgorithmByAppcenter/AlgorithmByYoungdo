import java.util.Scanner;
 
public class lostBracket {
    static int counter;
    static String fomular;
    static char[] array;
    static int[] cache;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         
        Scanner scan = new Scanner(System.in); // 문자 입력을 인자로 Scanner 생성
        fomular = (scan.nextLine()); // 키보드 문자 입력
        char []array = fomular.toCharArray();
        cache = new int[4];
        int start = 0; // 시작점 위치 or +, - 나온 후 시작점 위치 
        int total = 0; // 계수의 
        int result = 0;
        int check = 0; // - 부호가 나왔는지 확인
        int sqrt = 0;
        for(int i=0;i<array.length;i++) {
            result = 0;
            if(array[i] < 48 || array[i] > 57 || i == array.length-1) {
                if(i == array.length-1) {
                    sqrt = i-start+1;
                }else
                    sqrt = i-start;
                 
                for(int k=start;k<=i;k++) {
                    result += (int) (Character.getNumericValue(array[k]) * Math.pow(10, --sqrt));
                }
                 
                if(check >= 1) { //-가 나오지 않았을 때 
                    total -= result;
                }else {
                    total += result;
                }
                 
                if(array[i] == '-') //- 발생했을 경우 1
                    check++;
                 
                start = i+1;
            }
        }
        System.out.println(total);
    }
}