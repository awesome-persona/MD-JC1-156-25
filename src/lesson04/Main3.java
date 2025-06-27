package lesson04;

public class Main3 {

    public static void main(String[] args) {

        int[][] array = new int[4][3];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;

//        array[1][0] = 4;
//        array[1][1] = 5;
//        array[1][2] = 6;
        array[1] = new int[]{44, 44, 44, 44, 55, 66};
//        array[1][0] = 66;

        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;

        array[3][0] = 10;
        array[3][1] = 11;
        array[3][2] = 12;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%3s", array[i][j]);
            }
            System.out.println();
        }

        int[][] arr = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 10}
        };

        short[][][] t = new short[1024][1024][1024];
        // 1024 * 1024 * 1024 * 8 * 4 int (bits)
        // 1024 * 1024 * 1024 * 8 * 2 short (bits)
        // 1024 * 1024 * 1024 * 8 bits
    }
}
