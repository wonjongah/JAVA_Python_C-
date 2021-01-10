import java.util.Scanner;

public class practice7 {

    public void rect(int x, int y){
        if(x <= 200 && x >= 100 && y >= 100 && y <= 200){
            System.out.println(String.format("(%d, %d)는 사각형 안에 있습니다.", x, y));
        }
    }
    public static void main(String args[]){
        System.out.print("점 (x, y)의 좌표를 입력하시오 >> ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        practice7 p7 = new practice7();
        p7.rect(x, y);
        sc.close();
    }
}
