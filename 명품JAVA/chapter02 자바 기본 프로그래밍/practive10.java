import java.util.Scanner;

public class practive10 {

    public static boolean Circle(int c1x, int c1y, double c1r, int c2x, int c2y, double c2r){
        double distance = Math.sqrt((c1x - c2x) * (c1x - c2x) + (c1y - c2y) * (c1y - c2y));
        if ((c2r + c1r) >= distance){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        System.out.print("첫번째 원의 중심과 반지름 입력 >> ");
        Scanner sc = new Scanner(System.in);
        int c1x = sc.nextInt();
        int c1y = sc.nextInt();
        double c1r = sc.nextInt();
        System.out.print("두번째 원의 중심과 반지름 입력 >> ");
        int c2x = sc.nextInt();
        int c2y = sc.nextInt();
        double c2r = sc.nextInt();

        boolean circle = Circle(c1x, c1y, c1r, c2x, c2y, c2r);
        if(circle){
            System.out.println("두 원은 서로 겹친다.");
        }else{
            System.out.println("두 원은 겹치지 않는다.");
        }
        sc.close();
    }
}
