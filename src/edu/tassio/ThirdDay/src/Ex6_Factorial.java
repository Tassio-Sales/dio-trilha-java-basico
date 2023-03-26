
import java.util.Scanner;
public class Ex6_Factorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Factorial of: ");
        int factorial = scan.nextInt();

        int result = 1;


        System.out.println("Factorial of " + factorial + " is: ");
        System.out.print(factorial +"! = ");
        for( int i = factorial; i >= 1; i--) {
            result *= i;
            if (i > 1)
                System.out.print(i + " x ");
            else
                System.out.print(i);
        }
        System.out.println(" = " + result);
    }
}
