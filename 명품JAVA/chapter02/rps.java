import java.util.Scanner;

public class rps {
    public static void main(String args[]){
        
        System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ö�� >> ");
        String cheol = scanner.next();
        System.out.print("���� >> ");
        String young = scanner.next();

        if(cheol.equals(young)){
            System.out.println("�����ϴ�.");
        }

        if(cheol.equals("����")){
            if(young.equals("����")){
                System.out.println("���� �̰���ϴ�.");
            }else if(young.equals("��")){
                System.out.println("ö���� �̰���ϴ�.");
            }
        }
        else if(cheol.equals("����")){
            if(young.equals("����")){
                System.out.println("ö���� �̰���ϴ�.");
            }else if(young.equals("��")){
                System.out.println("���� �̰���ϴ�.");
            }
        }else if(cheol.equals("��")){
            if(young.equals("����")){
                System.out.println("���� �̰���ϴ�.");
            }else if(young.equals("����")){
                System.out.println("ö���� �̰���ϴ�.");
            }
        }else{
            System.out.println("�߸� �Է��ϼ̽��ϴ�.");
        }

        scanner.close();
    }
}
