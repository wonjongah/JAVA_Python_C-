public class ex3_16 {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[0] = 0;
        try{
            for(int i = 0; i < intArray.length; i++){
                intArray[i+1] = i + 1 + intArray[i]; // i = 4�� ��� ���� �߻�
                System.out.println("intArray[" + i + "]" + "=" + intArray[i]);
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("�迭�� �ε����� ������ ������ϴ�.");
        }
    }
}
