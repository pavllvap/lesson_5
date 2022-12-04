public class Task6 {
    public static void main(String[] args) {
        int[][] array = Task4.createAndPrintDoubleArray(5, 5);
        for (int i = 0; i < array.length; i++) {
            boolean bol = true;
            while (bol) {
                bol = false;
                for (int j = 0; j < array[i].length - 1; j++) {
                    if (array[i][j] > array[i][j + 1]) {
                        int temp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = temp;
                        bol = true;
                    }
                }
            }
        }
        for (int[] ints : array) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%3s", anInt);
            }
        }

    }
}



