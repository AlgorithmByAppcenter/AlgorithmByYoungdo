import java.util.Scanner;
 
public class lostBracket {
    static int counter;
    static String fomular;
    static char[] array;
    static int[] cache;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         
        Scanner scan = new Scanner(System.in); // ���� �Է��� ���ڷ� Scanner ����
        fomular = (scan.nextLine()); // Ű���� ���� �Է�
        char []array = fomular.toCharArray();
        cache = new int[4];
        int start = 0; // ������ ��ġ or +, - ���� �� ������ ��ġ 
        int total = 0; // ����� 
        int result = 0;
        int check = 0; // - ��ȣ�� ���Դ��� Ȯ��
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
                 
                if(check >= 1) { //-�� ������ �ʾ��� �� 
                    total -= result;
                }else {
                    total += result;
                }
                 
                if(array[i] == '-') //- �߻����� ��� 1
                    check++;
                 
                start = i+1;
            }
        }
        System.out.println(total);
    }
}