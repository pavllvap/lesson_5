public class Task3 {
    public static void main(String[] args) {
        int[][] array1 = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}};

        int[][] array2 = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}};

        for (int[] ints : array1) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%2d", anInt);
            }
        }
        System.out.println();
        for (int[] ints : array2) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%2s", anInt);
            }
        }
        System.out.println();

        int[][] array3 = new int[array1.length][array2[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                int sum = 0;
                for (int k = 0;  k < array2.length; k++){
                    sum += array1[i][k] * array2[k][j];
                }
                array3[i][j] = sum;
            }
        }
        for (int[] ints : array3) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%3s", anInt);
            }
        }
    }
}
