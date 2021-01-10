import java.util.Scanner;

public class practice9 {

    public void inCircle(int x, int y, int circleX, int circleY, double circleR){
        double distance = Math.sqrt((circleX - x) * (circleX - x) + (circleY - y) * (circleY - y));
        if(distance <= circleR){
            System.out.println(String.format("�� (%d, %d)�� �� �ȿ� �ִ�.", x, y));
        }else{
            System.out.println(String.format("�� (%d, %d)�� �� �ȿ� ����.", x, y));
        }
    }
    public static void main(String args[]){
        System.out.print("���� �߽ɰ� ������ �Է� >> ");
        Scanner sc = new Scanner(System.in);
        int circle_x = sc.nextInt();
        int circle_y = sc.nextInt();
        double radius = sc.nextDouble();

        System.out.print("�� �Է� >> ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        practice9 p9 = new practice9();
        p9.inCircle(x, y, circle_x, circle_y, radius);
    }
}
