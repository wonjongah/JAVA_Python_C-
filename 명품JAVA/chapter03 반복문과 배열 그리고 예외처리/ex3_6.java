import java.util.Scanner;

public class ex3_6 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit�� �Է��ϸ� �����մϴ�.");
        while(true){
            System.out.print(">>");
            String text = scanner.nextLine();
            if(text.equals("exit")){
                break;
            }
        }
        System.out.println("�����մϴ�.");
        scanner.close();
    }
}
