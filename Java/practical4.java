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
