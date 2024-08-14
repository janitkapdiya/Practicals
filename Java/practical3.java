//==========================QUESTION 1==========================
import java.util.Scanner; // Import Scanner class for taking input from user

public class Practical3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        System.out.println("Length = ");
        int L = scanner.nextInt(); // Take input for length
        System.out.println("Breadth = ");
        int B = scanner.nextInt(); // Take input for breadth

        // Calculate the area and perimeter
        int area = L * B; // Calculate area (L x B)
        int perimeter = 2 * (L + B); // Calculate perimeter (2 x (L + B))

        // Check which one is greater or if they are equal
        if (area > perimeter) { 
            System.out.println("Area"); // Print "Area" if area is greater
            System.out.println(area); // Print the value of area
        } else if (perimeter > area) {
            System.out.println("Perimeter"); // Print "Perimeter" if perimeter is greater
            System.out.println(perimeter); // Print the value of perimeter
        } else {
            System.out.println("Equal"); // Print "Equal" if area and perimeter are the same
            System.out.println(area);  // Print either area or perimeter (both are equal)
        }
    }	
}


//==========================QUESTION 2==========================
import java.util.Scanner; // Import Scanner class for taking user input
public class Practical3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Get the amount Pooja wishes to withdraw and her initial account balance
        System.out.println("Pooja wishes to withdraw:");
        float withdrawalAmount = scanner.nextFloat(); // Take input for withdrawal amount
        System.out.println("Pooja's initial account balance:");
        float initialBalance = scanner.nextFloat(); // Take input for initial account balance

        // Check if the withdrawal amount is a multiple of 5
        if (withdrawalAmount % 5 != 0) { // If withdrawal amount is not a multiple of 5
            System.out.println(initialBalance); // Print the initial balance without any change
            return; // Exit the program
        }

        // Calculate the total amount to be withdrawn (including bank charges)
        float totalAmount = withdrawalAmount + 5; // Add bank charge of 5 to withdrawal amount

        // Check if Pooja's account balance has enough cash to perform the withdrawal
        if (totalAmount > initialBalance) { // If total amount exceeds the initial balance
            System.out.println(initialBalance); // Print the initial balance without any change
        } else {
            // Calculate Pooja's account balance after the transaction
            float newBalance = initialBalance - totalAmount; // Subtract total amount from initial balance
            System.out.printf("%.2f", newBalance); // Print the new balance formatted to two decimal places
        }
    }
}


//==========================QUESTION 3==========================
import java.util.Scanner; // Import Scanner class for taking user input
public class Practical3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Get the number N
        System.out.println("N: ");
        int N = scanner.nextInt(); // Take input for the integer N

        // Check if N is divisible by 4, 6, and 10
        if (N % 4 == 0 && N % 6 == 0 && N % 10 == 0) {
            // If true, increment N by 1
            System.out.println("increment N by 1");
            N++; // Increment N by 1
        } else {
            // If false, decrement N by 1
            System.out.println("decrement N by 1");
            N--; // Decrement N by 1
        }

        // Print the new value of N
        System.out.println(N); // Output the new value of N
    }
}


//==========================QUESTION 4==========================
import java.util.Scanner; // Import Scanner class for taking user input
public class Practical3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Get the values of a, b, and c
        System.out.println("A:");
        int a = scanner.nextInt(); // Take input for the integer a
        System.out.println("B:");
        int b = scanner.nextInt(); // Take input for the integer b
        System.out.println("C:");
        int c = scanner.nextInt(); // Take input for the integer c

        // Check if a and b are zero
        if (a == 0 && b == 0) {
            System.out.println("No solution"); // If both a and b are zero, print "No solution"
            return; // Exit the program
        }

        // Check if a is zero
        if (a == 0) {
            int root = -c / b; // Calculate the single root when a is zero
            System.out.println("One root: " + root); // Print the single root
            return; // Exit the program
        }

        // Check if the discriminant (b^2 - 4ac) is negative
        int discriminant = b * b - 4 * a * c; // Calculate the discriminant
        if (discriminant < 0) {
            System.out.println("No real roots"); // If discriminant is negative, print "No real roots"
            return; // Exit the program
        }

        // Compute the two roots using the quadratic formula
        int root1 = (-b + (int) Math.sqrt(discriminant)) / (2 * a); // Calculate the first root
        int root2 = (-b - (int) Math.sqrt(discriminant)) / (2 * a); // Calculate the second root

        System.out.println("Two roots: " + root1 + " and " + root2); // Print the two roots
    }
}


//==========================QUESTION 5==========================
import java.util.Scanner; // Import Scanner class for taking user input

public class Practical3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Get the values of a, b, and c
        System.out.println("A:");
        int a = scanner.nextInt(); // Take input for the integer a
        System.out.println("B:");
        int b = scanner.nextInt(); // Take input for the integer b
        System.out.println("C:");
        int c = scanner.nextInt(); // Take input for the integer c

        // Check if a and b are zero
        if (a == 0 && b == 0) {
            System.out.println("No solution"); // If both a and b are zero, print "No solution"
            return; // Exit the program
        }

        // Check if a is zero
        if (a == 0) {
            int root = -c / b; // Calculate the single root when a is zero
            System.out.println("One root: " + root); // Print the single root
            return; // Exit the program
        }

        // Check if the discriminant (b^2 - 4ac) is negative
        int discriminant = b * b - 4 * a * c; // Calculate the discriminant
        if (discriminant < 0) {
            System.out.println("No real roots"); // If discriminant is negative, print "No real roots"
            return; // Exit the program
        }

        // Compute the two roots using the quadratic formula
        int root1 = (-b + (int) Math.sqrt(discriminant)) / (2 * a); // Calculate the first root
        int root2 = (-b - (int) Math.sqrt(discriminant)) / (2 * a); // Calculate the second root

        System.out.println("Two roots: " + root1 + " and " + root2); // Print the two roots
    }
}