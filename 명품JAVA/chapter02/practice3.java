import java.util.Scanner;

public class practice3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하시오 >>> ");
        int money = scanner.nextInt();

        int oman = money / 50000;
        int man = money % 50000 / 10000;
        int cheon = money % 10000 / 1000;
        int back = money % 1000 /100;
        int oship = money % 100 / 50;
        int ship = money % 50 / 10;
        int ill = money % 10;

        System.out.println("오만원권 " + oman + "매");
        System.out.println("만원권 " + man + "매");
        System.out.println("천원권 " + cheon + "매");
        System.out.println("백원 " + back + "개");
        System.out.println("오십원 " + oship + "개");
        System.out.println("십원 " + ship + "개");
        System.out.println("일원 " + ill + "개");

        scanner.close();
    }
}
