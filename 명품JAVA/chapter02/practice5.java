import java.util.Scanner;

public class practice5 {
    public static void main(String args[]){
        System.out.print("���� 3���� �Է��Ͻÿ� >> ");
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if((n1 + n2 > n3) || (n1 + n3 > n2) || (n2 + n3 > n1)){
            System.out.println("�ﰢ���� �˴ϴ�.");
        }else{
            System.out.println("�ﰢ���� ���� ���մϴ�.");
        }

        scanner.close();
    }
}
