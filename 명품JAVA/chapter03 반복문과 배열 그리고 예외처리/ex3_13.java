public class ex3_13 {
    public static void main(String[] args) {
        double sum = 0.0;

        for(int i = 0; i < args.length; i++){
            sum += Double.parseDouble(args[i]);
            // �ش� ���ڿ��� �Ǽ��� ��ȯ�� �����Ѵ�.
        }
        System.out.println("sum = " + sum);
    }
}
