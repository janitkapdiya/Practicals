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
public class practical1 { //DigitSum
    public static void main(String[] args) {
        int number = 12345, sum = 0, digit; // Initialize variables

        // Extract each digit and add to sum
        digit = number % 10; sum += digit; number /= 10;
        digit = number % 10; sum += digit; number /= 10;
        digit = number % 10; sum += digit; number /= 10;
        digit = number % 10; sum += digit; number /= 10;
        digit = number % 10; sum += digit;

        // Print the sum of the digits
        System.out.println("Addition of each digit is: " + sum);
    }
}

//================PRACTICAL C================
public class practical1 { // DigitProduct
    public static void main(String[] args) { // Main method
        int number = 23456, prod = 1, digit; // Initialize variables

        // Extract last digit and multiply it with prod
        digit = number % 10; 
        prod *= digit; 
        number /= 10; // Remove last digit

        // Repeat for the remaining digits
        digit = number % 10; 
        prod *= digit; 
        number /= 10;

        digit = number % 10; 
        prod *= digit; 
        number /= 10;

        digit = number % 10; 
        prod *= digit; 
        number /= 10;

        digit = number % 10; 
        prod *= digit;

        // Print the product of the digits
        System.out.println("Product of each digit is: " + prod);
    }
}


//==========================QUESTION 3==========================
//================PRACTICAL A================
public class  Practical1{ // SimpleInterest
    public static void main(String[] arg) { // Main method
        float principal = 2000, rate = 4; // Initialize principal and rate
        int time = 3; // Initialize time in years

        // Calculate simple interest
        float interest = (principal * rate * time) / 100;

        // Calculate total amount after interest
        float totalAmount = principal + interest;

        // Print the total amount after the specified time
        System.out.println("Total Amount after " + time + " years: " + totalAmount);
    }
}


//================PRACTICAL B================
public class  practical1{ // CompoundInterestCalculator
    public static void main(String[] args) { // Main method
        double principal = 1500, rate = 5; // Initialize principal and rate
        int time = 4; // Initialize time in years

        // Calculate compound interest
        double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;

        // Calculate total amount after interest
        double totalAmount = principal + compoundInterest;

        // Print the compound interest and total amount
        System.out.println("Compound Interest Earned: $" + compoundInterest);
        System.out.println("Total Amount after " + time + " years: $" + totalAmount);
    }
}