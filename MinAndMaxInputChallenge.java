import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {

        minAndMaxInput();
    }

    public static void minAndMaxInput() {

        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
//        boolean first = true;

        while (true) {

            System.out.println("Enter number");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {

                int number = scanner.nextInt();

//                if(first) {
//                    max = number;
//                    min = number;
//                    first = false;
//                }

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            } else {

                System.out.println("Invalid input.");
                break;
            }

            scanner.nextLine(); // handle key press (enter)
        }
        System.out.println("Min number: " + min + " Max number: " + max);
        scanner.close();
    }

}
