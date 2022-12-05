import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int[][][] array = new int[5][3][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = (int) (10 * Math.random());
                }
            }
        }

        printTripleArray(array);

        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += number;
                }
            }
        }
        printTripleArray(array);
    }

    public static void printTripleArray(int[][][] array) {
        for (int[][] ints : array) {
            System.out.println();
            for (int[] anInt : ints) {
                System.out.println();
                for (int i : anInt) {
                    System.out.printf("%4d", i);
                }
            }
        }
        System.out.println();
    }
}
