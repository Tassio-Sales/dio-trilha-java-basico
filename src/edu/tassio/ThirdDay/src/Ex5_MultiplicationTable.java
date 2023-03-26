
import java.util.Scanner;
public class Ex5_MultiplicationTable {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Multiplication table of: ");
        int multTable = scan.nextInt();

        System.out.println("The multiplication table of " + multTable + " is:");

        for (int i = 1; i <= 10; i++) {
           System.out.println(multTable + " X " + i + " = " + multTable * i);

        }
    }
}
