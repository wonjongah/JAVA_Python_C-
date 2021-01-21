import java.util.InputMismatchException;
import java.util.Scanner;

public class ex3_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 3개 입력하세요");
        int sum = 0, n = 0;
        for(int i = 0; i < 3; i++){
            System.out.print(i + ">>");
            try {
                n = sc.nextInt(); // 사용자가 정수 이외 입력시 예외
            } catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요");
                sc.nextLine(); // 현재 입력 스트림에 남아있는 토큰을 지운다.
                i--; // 인덱스도 -1
                continue;
            }
            sum += n;
        }
        System.out.println("합은 " + sum);
        sc.close();
    }
}
