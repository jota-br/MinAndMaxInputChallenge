import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {

        minAndMaxInput();
    }

    public static void minAndMaxInput() {

        Scanner scanner = new Scanner(System.in);

        int max = 0, min = 0;

        while (true) {

            System.out.println("Enter number");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {

                int number = scanner.nextInt();

                if(max == 0 && min == 0) {
                    max = number;
                    min = number;
                }

                if (number > max) {
                    max = number;
                } else if (number < min) {
                    min = number;
                }

            } else {

                System.out.println("Invalid input.");
                break;
            }

            System.out.println("Min number: " + min + " Max number: " + max);
            scanner.nextLine(); // handle key press (enter)
        }
        System.out.println("Min number: " + min + " Max number: " + max);
        scanner.close();
    }

}
