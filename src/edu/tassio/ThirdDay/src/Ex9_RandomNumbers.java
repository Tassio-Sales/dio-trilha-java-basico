
import java.util.Random;

public class Ex9_RandomNumbers {

    public static void main(String[] args) {

        Random random = new Random();

        int[] randomNumbers = new int[20];

        for(int i = 0; i < randomNumbers.length; i++) {
            int number0 = random.nextInt(100);
            randomNumbers[i] = number0;
        }

        System.out.print("Random numbers: ");

        for(int number1 : randomNumbers) {
            System.out.print(number1 + " ");
        }

        System.out.print("\nPredecessors of random numbers: ");

        for(int number3 : randomNumbers) {
            System.out.print(number3 - 1 + " ");
        }

        System.out.print("\nSuccessors of random numbers: ");

        for(int number2 : randomNumbers) {
            System.out.print(number2 + 1 + " ");
        }
    }
}
