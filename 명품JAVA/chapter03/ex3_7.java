import java.util.Scanner;

public class ex3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intArray[] = new int[5]; // �迭 ����
        int max = 0;
        System.out.println("��� 5���� �Է��ϼ���.");
        for(int i = 0; i < 5; i++){
            intArray[i] = sc.nextInt();
            if(intArray[i] > max){
                max = intArray[i];
            }
        }
        System.out.println("���� ū ���� " + max + "�Դϴ�.");

        sc.close();
    }
}
