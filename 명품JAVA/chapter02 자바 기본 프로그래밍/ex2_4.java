import java.util.Scanner;

public class ex2_4{
    public static void main(String args[]){
        System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.print("�̸��� " + name + ", ");

        String city = scanner.next();
        System.out.print("���ô� " + city + ", ");

        int age = scanner.nextInt();
        System.out.print("���̴� " + age + "��, ");

        double weight = scanner.nextDouble();
        System.out.print("ü���� " + weight + "kg, ");

        boolean isSingle = scanner.nextBoolean();
        System.out.println("���� ���δ� " + isSingle + "�Դϴ�.");
        scanner.close();
        
    }
}