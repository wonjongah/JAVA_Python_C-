import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        String c = sc.nextLine(); // 문자열 읽기
        char alpha = c.charAt(0); // 문자열의 첫 번째 문자
        int cnum = (int)alpha; // 문자의 아스키 코드
        int anum = (int)('a');
        int minus = cnum - anum + 1;
        int k = cnum;
        for(int i = minus; i > 0; i--){
            for(int j = anum; k >= j; j++){
                System.out.print((char)j);
            }
            k--;
            System.out.println();
        }
        sc.close();
    }
}
