import java.util.Scanner;

public class ex3_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divided; // ������
        int divisor; // ������

        System.out.print("�������� �Է��Ͻÿ�:");
        divided = sc.nextInt();
        System.out.print("�������� �Է��Ͻÿ�:");
        divisor = sc.nextInt();
        System.out.println(divided+"��"+divisor+"�� ������ ���� "
        + divided/divisor +"�Դϴ�.");
        sc.close();
    }
}
