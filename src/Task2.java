public class Task2 {
    public static void main(String[] args) {
        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (((i % 2 == 0 && j % 2 == 0)) || ((i % 2 != 0 && j % 2 != 0))){
                    array[i][j] = "W";
                } else {
                    array[i][j] = "B";
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.println();
            for (int j = 0; j < array[i].length; j++){
                System.out.printf("%3s",array[i][j]) ;
                }
            }
    }
}
