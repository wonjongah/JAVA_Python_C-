import java.util.Scanner;

public class practice11 {
    public static void main(String[] args) {
        System.out.print("���� �Է��ϼ���(1~12) >> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num >= 3 && num <= 5){
            System.out.println("��");
        }else if(num >= 6 && num <= 8){
            System.out.println("����");
        }else if(num >= 9 && num <= 11){
            System.out.println("����");
        }else if(num == 1 || num == 2 || num == 12){
            System.out.println("�ܿ�");
        }else{
            System.out.println("�߸��Է�");
        }
        sc.close();
    }
}
