import java.util.Scanner;

public class ex3_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divided; // 나뉨수
        int divisor; // 나눗수

        System.out.print("나뉨수를 입력하시오:");
        divided = sc.nextInt();
        System.out.print("나눗수를 입력하시오:");
        divisor = sc.nextInt();
        System.out.println(divided+"를"+divisor+"로 나누면 몫은 "
        + divided/divisor +"입니다.");
        sc.close();
    }
}
