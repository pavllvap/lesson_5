public class Task7 {
    public static void main(String[] args) {
        int [][] array = new int [7][7];


        for (int i = 0; i < (array.length) / 2; i++){
            for (int j = i; j < array[i].length - i; j++){
                array[i][j] = 1;
            }
        }

        for (int i = array.length - 1; i >=(array.length) / 2 ; i--){
            for (int j = i; j >= array[i].length-i-1; j--){
                array[i][j] = 1;
            }
        }

        for (int [] i: array) {
            System.out.println();
            for (int j: i){
                System.out.printf("%3s", j);
            }
        }
    }
}
