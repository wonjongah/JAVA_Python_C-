public class ex3_9 {
    enum Week {��, ȭ, ��, ��, ��, ��, ��}

    public static void main(String[] args) {
        int []n = {1,2,3,4,5};
        String names[] = {"���", "��", "ü��"};

        int sum = 0;
        for(int k : n){
        sum += k;
        }
        System.out.println("���� " + sum);

        for(String s : names){
            System.out.print(s + " ");
        }

        for (Week day : Week.values()){
            System.out.println(day + "���� ");
        }
    }
}
