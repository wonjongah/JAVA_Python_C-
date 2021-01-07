import java.util.Scanner;

public class practice5 {
    public static void main(String args[]){
        System.out.print("정수 3개를 입력하시오 >> ");
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if((n1 + n2 > n3) || (n1 + n3 > n2) || (n2 + n3 > n1)){
            System.out.println("삼각형이 됩니다.");
        }else{
            System.out.println("삼각형이 되지 못합니다.");
        }

        scanner.close();
    }
}
