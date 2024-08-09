//==========================QUESTION A==========================
//================PRACTICAL A================
public class practical1 //swapclass
{
    public static void main(String[] args){ 
        // Initialize variables
        int x = 20;
        int y = 40;

        // Print values before swapping
        System.out.println("Before swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Swap values using a temporary variable
        int temp = x; // Store x in temp
        x = y;        // Assign y to x
        y = temp;     // Assign temp (original x) to y

        // Print values after swapping
        System.out.println("After swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

//================PRACTICAL B================
public class practical1_2 //SwapWithoutTemp
{
    public static void main(String[] args) {
        // Initialize variables
        int a = 10;
        int b = 20;

        // Print values before swapping
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap values without using a temporary variable
        a = a + b; // a becomes 30 (10 + 20)
        b = a - b; // b becomes 10 (30 - 20)
        a = a - b; // a becomes 20 (30 - 10)

        // Print values after swapping
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

//==========================QUESTION 2==========================
//================PRACTICAL A================
public class practical1 { // BasicArithmetic
    public static void main(String[] arg) { // Main method
        int num1 = 100; // Initialize num1
        int num2 = 25; // Initialize num2

        int addition = num1 + num2; // Add numbers
        int subtraction = num1 - num2; // Subtract numbers
        int multiplication = num1 * num2; // Multiply numbers
        int division = num1 / num2; // Divide numbers

        // Print results
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
}

//================PRACTICAL B================
