public class p1 {
    public static void main(String[] args) {
        int sum = 0, i = 0;
        while(i < 100){
            sum = sum + i;
            i += 2;
        }
        System.out.println(sum);
        // 1. 0���� 99���� ¦���� ���� ���ϴ� �ڵ�, ��� ���� = 2450
        // 2. p1�� WhileTest�� �ٲٸ� �ȴ�.
        // 3. while���� ���� for������ ��ü
        // for(i = 0; i < 100; i += 2){
        //     sum = sum + i;
        // }
        // 4. while���� ���� do-while������ ��ü
        // do{
        //     sum = sum + i;
        //     i += 2;
        // }while(i < 100);
    }
}
