public class ex3_12 {
    static int[] makeArray(){
        int temp[] = new int[4];
        for(int i = 0; i < temp.length; i++){
            temp[i] = i;
        }
        return temp;
        // temp는 함수가 끝나면 소멸하지만
        // 생성된 배열은 소멸되지 않음
    }
    public static void main(String[] args) {
        int intArray[]; // 배열 레퍼런스 선언
        intArray = makeArray(); // intArray는 makeArray()가 리턴한 배열을 가리킴
        for(int i : intArray){
            System.out.print(i + " ");
        }
    }
}
