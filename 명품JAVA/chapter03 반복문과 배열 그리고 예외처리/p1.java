public class p1 {
    public static void main(String[] args) {
        int sum = 0, i = 0;
        while(i < 100){
            sum = sum + i;
            i += 2;
        }
        System.out.println(sum);
        // 1. 0부터 99까지 짝수의 합을 구하는 코드, 출력 내용 = 2450
        // 2. p1을 WhileTest로 바꾸면 된다.
        // 3. while문을 밑의 for문으로 대체
        // for(i = 0; i < 100; i += 2){
        //     sum = sum + i;
        // }
        // 4. while문을 밑의 do-while문으로 대체
        // do{
        //     sum = sum + i;
        //     i += 2;
        // }while(i < 100);
    }
}
