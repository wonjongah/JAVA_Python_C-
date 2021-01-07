import java.util.Scanner;

public class practice4 {

    public int midnum(int num1, int num2, int num3){
        int mid;
        if((num1 > num2 && num2 > num3) || (num1 < num2 && num2 < num3)){
            mid = num2;
        }else if((num1 > num2 && num1 < num3) || (num2 > num1 && num1 > num3)){
            mid = num1;
        }else{
            mid = num3;
        }
        return mid;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 3개를 입력하시오 >> ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        practice4 p4 = new practice4();
        int midnum = p4.midnum(num1, num2, num3);

        System.out.println("중간값은 " + midnum);

        scanner.close();
    }
}
