public class Task4 {
    public static void main(String[] args) {
        int[][] array = createAndPrintDoubleArray(5,5);
        int sum = 0;
        for (int[] innerArray : array){
            for (int j : innerArray) {
                sum +=j;
            }
        }
        System.out.println(sum);
    }

    public static int[][] createAndPrintDoubleArray(int lines, int columns) {
        int[][] array = new int[lines][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (10 * Math.random());
            }
        }
        for (int[] ints : array) {
            System.out.println();
            for (int anInt : ints) {
                System.out.printf("%3s", anInt);
            }
        }
        System.out.println();
        return array;
    }





}
