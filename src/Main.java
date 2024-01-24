
import java.util.Scanner;
public class Main {
//it's calculator12311111
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number:");
        int num1 = scanner.nextInt();

        System.out.print("input second number:");
        int num2 = scanner.nextInt();


        int res;

        System.out.print("action:");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("its:" + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("its:" + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("its:" + res);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("Error");
                else {
                    res = num1 / num2;
                    System.out.println("its:" + res);
                }
                    break;
                    default:
                        System.out.println("some wrong.");

                }


        }
    }
