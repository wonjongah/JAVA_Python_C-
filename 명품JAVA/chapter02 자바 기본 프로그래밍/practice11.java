import java.util.Scanner;

public class practice11 {
    public static void main(String[] args) {
        System.out.print("답을 입력하세요(1~12) >> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num >= 3 && num <= 5){
            System.out.println("봄");
        }else if(num >= 6 && num <= 8){
            System.out.println("여름");
        }else if(num >= 9 && num <= 11){
            System.out.println("가을");
        }else if(num == 1 || num == 2 || num == 12){
            System.out.println("겨울");
        }else{
            System.out.println("잘못입력");
        }
        sc.close();
    }
}
