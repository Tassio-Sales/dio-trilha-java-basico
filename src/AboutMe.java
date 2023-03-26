import java.sql.SQLOutput;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("Enter your surname: ");
        String surname = scanner.next();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();

        System.out.println("Hello, my name is " + name + " " + surname);
        System.out.println("I have " + age + " years");
        System.out.println(" My height is "+ height + " cm");
    }
}
