
import java.util.Scanner;
public class Ex3_HighestGrade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number;
        int counter = 0;
        int highest;
        double sum = 0;

        System.out.println("Number: ");
        number = scan.nextInt();
        sum = highest = number;

        do {
            System.out.println("Number: ");
            number = scan.nextInt();
            if (number > highest)
                highest = number;
            sum += number;
            counter++;

        } while (counter < 4);

        System.out.println("Highest: " + highest);
        System.out.println("Average: " + sum/5);
    }
}
