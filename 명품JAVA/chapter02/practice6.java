import java.util.Scanner;

public class practice6 {

    public void num369(int num){

        int first = num / 10;
        int second = num % 10;
        if((first % 3 == 0) || (second % 3 == 0)){
            System.out.println("�ڼ�¦");
        }else if((first % 3 == 0) && (second % 3 == 0)){
            System.out.println("�ڼ�¦¦");
        }
    }
    public static void main(String args[]){
        System.out.print("1~99 ������ ������ �Է��Ͻÿ� >> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        practice6 p6 = new practice6();
        p6.num369(num);
        sc.close();
    }
}
