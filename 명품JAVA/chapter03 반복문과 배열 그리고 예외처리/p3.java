import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        System.out.print("������ �Է��Ͻÿ� >> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int x = 5; x > 0; x--){
            for(int y = 0; x - y != 0; y++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
