
import java.util.Scanner;
public class Ex8_Consonants {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] consonants = new String[6];

        int amountConsonants = 0;

        int counter = 0;

        do {
            System.out.println("Letter: ");
            String letter = scan.next();

            if (!((letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") ||
                    letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") ||
                    letter.equalsIgnoreCase("u")))) {
                consonants[counter] = letter;
                amountConsonants++;

            }

            counter++;

        } while (counter < consonants.length);

        System.out.print("Consonants: ");

        for (String consonant: consonants) {
            if (consonant != null)
                System.out.print(consonant + " ");
        }
        System.out.println();
        System.out.println("Number of consonants: " + amountConsonants);

    }
}
