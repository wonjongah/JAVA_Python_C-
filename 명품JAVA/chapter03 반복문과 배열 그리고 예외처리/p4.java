import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
        String c = sc.nextLine(); // ���ڿ� �б�
        char alpha = c.charAt(0); // ���ڿ��� ù ��° ����
        int cnum = (int)alpha; // ������ �ƽ�Ű �ڵ�
        int anum = (int)('a');
        int minus = cnum - anum + 1;
        int k = cnum;
        for(int i = minus; i > 0; i--){
            for(int j = anum; k >= j; j++){
                System.out.print((char)j);
            }
            k--;
            System.out.println();
        }
        sc.close();
    }
}
