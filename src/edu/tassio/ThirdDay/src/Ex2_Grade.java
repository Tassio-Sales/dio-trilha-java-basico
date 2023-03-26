
import java.util.Scanner;
public class Ex2_Grade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int grade;

        System.out.println("Grade: ");
        grade = scan.nextInt();

        while(grade < 0 || grade > 10) {
            System.out.println("Invalid grade! Please, enter a new grade: ");
            grade = scan.nextInt();
        }
    }
}
