import java.util.Scanner;

public class ex3_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divided; // ������
        int divisor; // ������

        while(true){
            System.out.print("�������� �Է��Ͻÿ�:");
            divided = sc.nextInt();
            System.out.print("�������� �Է��Ͻÿ�:");
            divisor = sc.nextInt();

            try{
                System.out.println(divided+"��"+divisor+"�� ������ ���� "
                + divided/divisor +"�Դϴ�.");
                break; // �������� ������ �Ϸ� �� while �����
            }catch(ArithmeticException e){
                System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���.");
            }
        }
        sc.close();
    }
}
