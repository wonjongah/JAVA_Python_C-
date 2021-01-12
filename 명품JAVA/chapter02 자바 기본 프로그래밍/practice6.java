import java.util.Scanner;

public class practice6 {

    public void num369(int num){

        int first = num / 10;
        int second = num % 10;
        if((first % 3 == 0) || (second % 3 == 0)){
            System.out.println("박수짝");
        }else if((first % 3 == 0) && (second % 3 == 0)){
            System.out.println("박수짝짝");
        }
    }
    public static void main(String args[]){
        System.out.print("1~99 사이의 정수를 입력하시오 >> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        practice6 p6 = new practice6();
        p6.num369(num);
        sc.close();
    }
}
