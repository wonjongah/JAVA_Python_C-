import java.util.Scanner;

public class practice12 {

    public static void calc(int num1, String s, int num2){
        int result = 0;
        switch(s){
            case "+":
            result = num1 + num2;
            System.out.println(String.format("%d%s%d의 계산 결과는 %d", num1, s, num2, result));
            break;
            case "-":
            result = num1 - num2;
            System.out.println(String.format("%d%s%d의 계산 결과는 %d", num1, s, num2, result));
            break;
            case "*":
            result = num1 * num2;
            System.out.println(String.format("%d%s%d의 계산 결과는 %d", num1, s, num2, result));
            break;
            case "/":
            if(num2 == 0){
                System.out.println("0으로 나눌 수 없습니다.");
            }
            result = num1 / num2;
            System.out.println(String.format("%d%s%d의 계산 결과는 %d", num1, s, num2, result));
            break;
            default:
            System.out.println("연산자를 잘못 입력했습니다.");
        }
    }
    public static void main(String[] args) {
        System.out.print("연산 >> ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String s = sc.next();
        int num2 = sc.nextInt();
        
        calc(num1, s, num2);
        sc.close();
    }
}
