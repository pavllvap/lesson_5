public class Task5 {
    public static void main(String[] args) {
        int[][] array = Task4.createAndPrintDoubleArray(5, 5);

        for (int i = 0; i < array.length; i++) {
            for (int j = i; ; ) {
                System.out.println(array[i][j]);
                break;
            }
        }
        System.out.println("----------------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1 - i; ; ) {
                System.out.println(array[i][j]);
                break;
            }
        }
    }
}



