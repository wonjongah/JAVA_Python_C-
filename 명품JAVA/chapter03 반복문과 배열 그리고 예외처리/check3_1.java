public class check3_1 {
    public static void main(String args[]){
        int tenArray[] = new int[10]; // 레퍼런스 선언 + 10개 인덱스 가진 배열 선언

        // 배열의 크기
        System.out.println(String.format("tenArray의 크기는 %d입니다.", tenArray.length));
        
        // 1~10 저장, 합 출력
        int sum = 0;
        for(int i = 0; i < 10; i++){ 
            tenArray[i] = i + 1;
            sum += tenArray[i];
        }
        System.out.println(String.format("tenArray의 합은 %d입니다.", sum));

    }
}
