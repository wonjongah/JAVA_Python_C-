import java.util.Scanner;

public class practice3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("�ݾ��� �Է��Ͻÿ� >>> ");
        int money = scanner.nextInt();

        int oman = money / 50000;
        int man = money % 50000 / 10000;
        int cheon = money % 10000 / 1000;
        int back = money % 1000 /100;
        int oship = money % 100 / 50;
        int ship = money % 50 / 10;
        int ill = money % 10;

        System.out.println("�������� " + oman + "��");
        System.out.println("������ " + man + "��");
        System.out.println("õ���� " + cheon + "��");
        System.out.println("��� " + back + "��");
        System.out.println("���ʿ� " + oship + "��");
        System.out.println("�ʿ� " + ship + "��");
        System.out.println("�Ͽ� " + ill + "��");

        scanner.close();
    }
}
