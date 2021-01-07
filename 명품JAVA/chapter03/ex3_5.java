import java.util.Scanner;

public class ex3_5 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 5개를 입력하세요. ");
        int sum = 0;
        for(int i = 0; i < 5; i++){
            int n = scanner.nextInt();
            if(n <= 0){
                continue; // 양수가 아닐 경우 다음 반복으로 진행
            }else{
                sum += n; // 양수이면 덧셈
            }
        }
        System.out.println("양수의 합은 " + sum);

        scanner.close();
    }
}
