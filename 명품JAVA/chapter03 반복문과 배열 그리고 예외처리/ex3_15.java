import java.util.Scanner;

public class ex3_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divided; // 나뉨수
        int divisor; // 나눗수

        while(true){
            System.out.print("나뉨수를 입력하시오:");
            divided = sc.nextInt();
            System.out.print("나눗수를 입력하시오:");
            divisor = sc.nextInt();

            try{
                System.out.println(divided+"를"+divisor+"로 나누면 몫은 "
                + divided/divisor +"입니다.");
                break; // 정상적인 나누기 완료 후 while 벗어나기
            }catch(ArithmeticException e){
                System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
            }
        }
        sc.close();
    }
}
