import java.util.Scanner;


public class practice1 {

    public double wontodollar(int won) {
        return won * 1/1100;
    }
    public static void main(String args[]){

        System.out.print("��ȭ�� �Է��ϼ���(���� ��) >> ");
        Scanner scanner = new Scanner(System.in);
        int won = scanner.nextInt();

        practice1 p1 = new practice1();
        double dollar = p1.wontodollar(won);

        System.out.print(won + "���� $" + dollar + "�Դϴ�.");

        scanner.close();
    }
}
