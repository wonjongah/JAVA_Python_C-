import java.util.Scanner;

public class practice8 {

    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2){
        if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2)){
            return true;
        }else return false;
    }
    public static void main(String args[]){
        System.out.print("(x1, y1), (x2, y2)�� �Է��Ͻÿ� >> ");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        boolean isInRect = inRect(100, 200, x1, y1, x2, y2);
        if(isInRect){
            System.out.println(String.format("(%d, %d), (%d, %d)�� (100, 100), (200, 200) ����簢���� �浹�մϴ�.", x1, y1, x2, y2));
        }else{
            System.out.println(String.format("(%d, %d), (%d, %d)�� (100, 100), (200, 200) ����簢���� �浹���� �ʽ��ϴ�.", x1, y1, x2, y2));
        }
    }
}
