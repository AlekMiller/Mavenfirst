package Lessons;
import java.util.Scanner;

public class InteractRunner {
    public static void main(String[] arg) {
        try (Scanner in = new Scanner(System.in)) {
            String exit = "no";
            String choose = "no";

            Calculator calculator = new Calculator();
            while (!exit.equals("no")) {
                if (choose.equals("no"))
                    calculator.cleanResult();
                /*
                    Continue with last parameters
                 */
                if (choose.equals("yes")) {
                    String first = Integer.toString(calculator.getResult());
                    calculator.cleanResult();
                    System.out.println("Please enter second numb");
                    String second = in.next();
                    System.out.println("Please chose operation \n plus \n minus \n div");
                    String operation = in.next();
                    try {
                        calculator.chooseOperation(operation,Integer.valueOf(first), Integer.valueOf(second));
                        System.out.println("Please enter params");
                    } catch (UserException userExeption) {
                        System.out.println(userExeption.getMessage());
                    }
                    System.out.println("Result - " + calculator.getResult());
                    System.out.println("Exit - yes/no");
                    exit = in.next();
                /*
                    Start with new parameters
                 */
                } else if (choose.equals("no")) {
                    System.out.println("Please enter first numb");
                    String first = in.next();
                    System.out.println("Please enter second numb");
                    String second = in.next();
                    System.out.println("Please chose operation \n plus \n minus \n div");
                    String operation = in.next();
                    try {
                        calculator.chooseOperation(operation,Integer.valueOf(first), Integer.valueOf(second));
                        System.out.println("Result- " + calculator.getResult());
                    } catch (UserException userException) {
                        System.out.println(userException.getMessage());
                    }

                    System.out.println("Exit - yes/no");
                    exit = in.next();

                }
                else {
                    System.out.println("Please enter yes/no");
                }
                    if (exit.equals("no")) {
                        System.out.println("Do you wanna continue with last number?");
                        choose = in.next();
                    }


            }
        }
    }
}

