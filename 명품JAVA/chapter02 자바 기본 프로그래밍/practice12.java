import java.util.Scanner;

public class practice12 {

    public static void calc(int num1, String s, int num2){
        int result = 0;
        switch(s){
            case "+":
            result = num1 + num2;
            System.out.println(String.format("%d%s%d�� ��� ����� %d", num1, s, num2, result));
            break;
            case "-":
            result = num1 - num2;
            System.out.println(String.format("%d%s%d�� ��� ����� %d", num1, s, num2, result));
            break;
            case "*":
            result = num1 * num2;
            System.out.println(String.format("%d%s%d�� ��� ����� %d", num1, s, num2, result));
            break;
            case "/":
            if(num2 == 0){
                System.out.println("0���� ���� �� �����ϴ�.");
            }
            result = num1 / num2;
            System.out.println(String.format("%d%s%d�� ��� ����� %d", num1, s, num2, result));
            break;
            default:
            System.out.println("�����ڸ� �߸� �Է��߽��ϴ�.");
        }
    }
    public static void main(String[] args) {
        System.out.print("���� >> ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String s = sc.next();
        int num2 = sc.nextInt();
        
        calc(num1, s, num2);
        sc.close();
    }
}
