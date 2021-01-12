public class ex3_9 {
    enum Week {월, 화, 수, 목, 금, 토, 일}

    public static void main(String[] args) {
        int []n = {1,2,3,4,5};
        String names[] = {"사과", "배", "체리"};

        int sum = 0;
        for(int k : n){
        sum += k;
        }
        System.out.println("합은 " + sum);

        for(String s : names){
            System.out.print(s + " ");
        }

        for (Week day : Week.values()){
            System.out.println(day + "요일 ");
        }
    }
}
