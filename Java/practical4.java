//==========================QUESTION 1=========================
import java.util.Scanner; // Import Scanner class for user input
public class Practical_4{ //MonthName
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        System.out.println("Enter a month number (1-12): "); // Prompt user
        int num = scanner.nextInt(); // Read user input

        // Determine month name based on number
        switch (num) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid input"); // Handle invalid input
                break;
        }
    }
}

//==========================QUESTION 2=========================
import java.util.Scanner; // Import Scanner class for user input
public class practical_4 { //WeekdayName
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        System.out.println("Enter a weekday number (1-7): "); // Prompt user
        int num = scanner.nextInt(); // Read user input

        // Determine weekday name based on number
        switch (num) {
            case 1:
                System.out.println("Sunday"); break;
            case 2:
                System.out.println("Monday"); break;
            case 3:
                System.out.println("Tuesday"); break;
            case 4:
                System.out.println("Wednesday"); break;
            case 5:
                System.out.println("Thursday"); break;
            case 6:
                System.out.println("Friday"); break;
            case 7:
                System.out.println("Saturday"); break;
            default:
                System.out.println("Invalid input"); // Handle invalid input
                break;
        }
    }
}

//==========================QUESTION 3=========================
import java.util.Scanner; // Import Scanner class for user input
public class practical_4 { //Even/Odd check
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        System.out.println("Enter a number: "); // Prompt user for input
        int num = scanner.nextInt(); // Read user input

        // Use bitwise AND to check if the number is even or odd
        switch (num & 1) {
            case 0:
                System.out.println(num + " is even"); // Output if the number is even
                break;
            case 1:
                System.out.println(num + " is odd"); // Output if the number is odd
                break;
        }
    }
}

//==========================QUESTION 4=========================
import java.util.Scanner; // Import Scanner class for user input
public class practical_4 { //Highest & Lowest of three numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        System.out.print("Input first number: "); // Prompt for first number
        int num1 = scanner.nextInt(); // Read first number
        System.out.print("Input second number: "); // Prompt for second number
        int num2 = scanner.nextInt(); // Read second number
        System.out.print("Input third number: "); // Prompt for third number
        int num3 = scanner.nextInt(); // Read third number

        // Variables to store the highest and lowest numbers
        int highest = 0;
        int lowest = 0;

        // Single switch statement used to determine highest and lowest
        switch (1) {
            case 1:
                // Determine the highest number
                if (num1 >= num2 && num1 >= num3) {
                    highest = num1;
                } else if (num2 >= num1 && num2 >= num3) {
                    highest = num2;
                } else {
                    highest = num3;
                }
                // Determine the lowest number
                if (num1 <= num2 && num1 <= num3) {
                    lowest = num1;
                } else if (num2 <= num1 && num2 <= num3) {
                    lowest = num2;
                } else {
                    lowest = num3;
                }
                break;
        }
        
        // Output the results
        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);
    }
}

//==========================QUESTION 5=========================
import java.util.Scanner; // Import Scanner class for user input
public class practical_4 { // Checking if two strings are the same or different
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        System.out.print("Input first string: "); // Prompt for the first string
        String str1 = scanner.nextLine(); // Read the first string
        System.out.print("Input second string: "); // Prompt for the second string
        String str2 = scanner.nextLine(); // Read the second string

        // Compare the two strings
        int result = str1.equals(str2) ? 1 : 0; // Set result to 1 if strings are equal, otherwise 0

        // Use switch-case to determine the output based on the comparison result
        switch (result) {
            case 1:
                System.out.println("Strings are the same"); // Output if strings are equal
                break;
            case 0:
                System.out.println("Strings are different"); // Output if strings are not equal
                break;
            default:
                System.out.println("Unexpected case"); // Handle any unexpected case
        }
    }
}
