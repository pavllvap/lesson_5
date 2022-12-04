import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int length = (int) (10 * Math.random());
        int [][][] array = new int[length][length][length];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                for (int k = 0; k < array[j].length; k++){
                    array[i][j][k] = (int) (10 * Math.random());
                }
            }
        }

        printTripleArray(array);

        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                for (int k = 0; k < array[j].length; k++){
                    array[i][j][k] += number ;
                }
            }
        }
        printTripleArray(array);
    }

    public static void printTripleArray(int[][][] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println();
            for (int j = 0; j < array[i].length; j++){
                System.out.println();
                for (int k = 0; k < array[j].length; k++){
                    System.out.printf("%4d", array[i][j][k]) ;
                }
            }
        }
        System.out.println();
    }


}
