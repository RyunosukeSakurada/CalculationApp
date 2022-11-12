import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Instantiate
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        //↑Receives values entered by the user from the keyboard
        String exit = "";

        //toLowerCase() : Lowercase uppercase letters in a string
        while (!exit.toLowerCase().equals("quit")) {
            try {
                System.out.println("Please type the first number:");
                double n1 = scanner.nextDouble();
                //scanner.nextDouble() : Receive the DOUBLE type from the user.
                System.out.println("Choose an operation:\n"
                        + " > Type + for addition\n"
                        + " > Type - for subtraction\n"
                        + " > Type * for multiplication\n"
                        + " > Type / for division\n");
                String op = scanner.next(); // [+, ertwetwetwet]
                //scanner.next() : Method to retrieve a string up to whitespace when a string is entered.
                System.out.println("Type the second number:");
                double n2 = scanner.nextDouble();

                calc.doCalculation(op, n1, n2);
                //↑to access "doCaluculation" situated in Calculator class by using "op,n1,n2" (assign)
                calc.printResult(op);
                //↑to access "printResult" situated in Calculator class by using "op" (assign)

                System.out.println("Do you want to 'continue' or 'quit'?");

                exit = scanner.next();
                //scanner.next() : Method to retrieve a string up to whitespace when a string is entered.

            } catch (InvalidOperatorException e) {
                System.out.println(e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero. Please try again...");
            }

        }

        System.out.println("Bye");
        scanner.close();
        System.exit(0);
    }
}
