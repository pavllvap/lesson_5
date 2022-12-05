public class Task5 {
    public static void main(String[] args) {
        int[][] array = Task4.createAndPrintDoubleArray(5, 5);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d",array[i][i]);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d", array[i][array.length - 1 - i]);
        }
    }
}



