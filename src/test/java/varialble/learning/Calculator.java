package varialble.learning;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char calculation;
        double number1, number2, result;
        do {
            System.out.println("Enter the calculator operator you want to perform");
            calculation = sc.next().charAt(0);
            if (calculation != '+' || calculation == '-' || calculation == '*' || calculation == '/' || calculation == '%') {
                System.out.print("Kindly Retry :"+ " ");}
            else {
                    System.out.println("Enter First Number");
                    number1 = sc.nextDouble();
                    System.out.println("Enter Second Number");
                    number2 = sc.nextDouble();

                    switch (calculation) {
                        case '+':
                            result = number1 + number2;
                            System.out.println("Result is :" + " " + result);
                            break;
                        case '-':
                            result = number1 - number2;
                            System.out.println("Result is :" + " " + result);
                            break;
                        case '*':
                            result = number1 * number2;
                            System.out.println("Result is :" + " " + result);
                            break;
                        case '/':
                            result = number1 / number2;
                            System.out.println("Result is :" + " " + result);
                            break;
                        case '%':
                            result = number1 % number2;
                            System.out.println("Result is :" + " " + result);
                            break;
                        case '0':
                            System.out.println("You have exited the program ");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Your Input Is Invalid");
                            break;

                    }
                }

            } while (calculation != 0) ;

        }
    }