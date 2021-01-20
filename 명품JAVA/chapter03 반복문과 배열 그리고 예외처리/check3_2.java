public class check3_2 {
    public static void main(String[] args) {
        // int i[][] = {{0, 1, 2, 3}, {4}, {5}, {6, 7, 8, 9}};
        int i[][] = new int[4][];
        i[0] = new int[4];
        i[1] = new int[1];
        i[2] = new int[1];
        i[3] = new int[4];

        int num = 0;

        for(int x = 0; x < i.length; x++){
            for(int y = 0; y < i[x].length; y++){
                i[x][y] = num;
                num++;
                System.out.print(i[x][y] + " ");
            }
            System.out.println();
        }
    }
}
