public class ex3_18 {
    public static void main(String[] args) {
        String[] stringNumber = {"23", "27", "3.14", "74"};

        int i = 0;
        try{
            for(i=0; i < stringNumber.length;i++){
                int j = Integer.parseInt(stringNumber[i]);
                System.out.println("������ ��ȯ�� ���� " + j); // 3.14���� ����
            }
        }catch(NumberFormatException e){
            System.out.println(stringNumber[i] + "�� ������ ��ȯ�� �� �����ϴ�.");
        }
    }
}
