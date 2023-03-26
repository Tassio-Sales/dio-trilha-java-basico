

import java.util.Random;
public class Ex10_ArrayMultidimensional {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] Matrix = new int[4][4];

        for(int i = 0; i < Matrix.length; i++) {
            for(int j = 0; j < Matrix[i].length; j++) {
                Matrix[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matrix: ");
        for (int[] line : Matrix) {
            for (int column : line) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

    }
}
