public class ex3_12 {
    static int[] makeArray(){
        int temp[] = new int[4];
        for(int i = 0; i < temp.length; i++){
            temp[i] = i;
        }
        return temp;
        // temp�� �Լ��� ������ �Ҹ�������
        // ������ �迭�� �Ҹ���� ����
    }
    public static void main(String[] args) {
        int intArray[]; // �迭 ���۷��� ����
        intArray = makeArray(); // intArray�� makeArray()�� ������ �迭�� ����Ŵ
        for(int i : intArray){
            System.out.print(i + " ");
        }
    }
}
