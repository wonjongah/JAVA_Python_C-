import java.util.Scanner;

public class ex2_5 {
    public static void main(String argsp[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("������ �Է��ϼ���: ");
        int time = scanner.nextInt();
        int second = time % 60;
        int minute = (time / 60) % 60;
        int hour = (time / 60) / 60;

        System.out.print(time + "�ʴ� ");
        System.out.print(hour + "�ð�, ");
        System.out.print(minute + "��, ");
        System.out.println(second + "���Դϴ�.");
        scanner.close();
    }    
}
