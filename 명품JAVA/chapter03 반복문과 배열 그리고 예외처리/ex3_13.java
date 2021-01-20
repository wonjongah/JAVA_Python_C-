public class ex3_13 {
    public static void main(String[] args) {
        double sum = 0.0;

        for(int i = 0; i < args.length; i++){
            sum += Double.parseDouble(args[i]);
            // 해당 문자열을 실수로 변환해 리턴한다.
        }
        System.out.println("sum = " + sum);
    }
}
