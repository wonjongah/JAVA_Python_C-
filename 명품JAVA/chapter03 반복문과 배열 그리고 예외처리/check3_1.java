public class check3_1 {
    public static void main(String args[]){
        int tenArray[] = new int[10]; // ���۷��� ���� + 10�� �ε��� ���� �迭 ����

        // �迭�� ũ��
        System.out.println(String.format("tenArray�� ũ��� %d�Դϴ�.", tenArray.length));
        
        // 1~10 ����, �� ���
        int sum = 0;
        for(int i = 0; i < 10; i++){ 
            tenArray[i] = i + 1;
            sum += tenArray[i];
        }
        System.out.println(String.format("tenArray�� ���� %d�Դϴ�.", sum));

    }
}
