import java.util.Scanner;

public class Ex4_PairAndOdd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int amountNumbers, number, counter = 0, amountPair = 0, amountOdd = 0;

        System.out.println("Amount of numbers: ");
        amountNumbers = scan.nextInt();

        do {
            System.out.println("Number: ");
            number = scan.nextInt();

            if (number % 2 == 0)
                amountPair++;
            else
                amountOdd++;

            counter++;
        } while (counter < amountNumbers);

        System.out.println("Number of pairs numbers: " + amountPair);
        System.out.println("Number of odd numbers: " + amountOdd);

    }
}
