public class Ex7_ReverseOrder {

    public static void main(String[] args) {

        int[] vector = { -5, -6, 15, 50, 8, 4};

        int counter = 0;

        while (counter < vector.length) {
            System.out.print(vector[counter] + " ");
            counter++;
        }
        System.out.println();
        for(int i = (vector.length - 1); i >= 0; i--) {
            System.out.print(vector[i]+ " ");
        }
    }
}
