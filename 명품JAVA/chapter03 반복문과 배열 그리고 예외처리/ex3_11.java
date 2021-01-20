public class ex3_11 {
    public static void main(String[] args) {
        int intArray[][] = new int[4][];
        intArray[0] = new int[3];
        intArray[1] = new int[2];
        intArray[2] = new int[3];
        intArray[3] = new int[2];

        for(int i = 0; i < intArray.length; i++){ // 행 반복
            for(int j = 0; j < intArray[i].length; j++){ // 열 반복
                intArray[i][j] = (i + 1) * 10 + j;
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
