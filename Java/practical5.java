//==========================QUESTION 1=========================
import java.util.Scanner;
public class practical5{ //Relational Operators 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int T = sc.nextInt();
        
        // Iterate through each test case
        for (int i = 0; i < T; i++) {
            // Read the two integers A and B
            long A = sc.nextLong();
            long B = sc.nextLong();
            
            // Compare A and B and print the corresponding relational operator
            if (A < B) {
                System.out.println("<");
            } else if (A > B) {
                System.out.println(">");
            } else {
                System.out.println("=");
            }
        }
        
        sc.close();
    }
}


//==========================QUESTION 2=========================
//================QUESTION A================
public class  practical5{//NaturalNumbersSeries
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // Adjust the limit as needed
            System.out.print(i + " ");
        }
    }
}

//================QUESTION B================
import java.util.Scanner;
public class practical5{ //MultiplicationTable
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to generate its table: ");
        int num = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) { // Adjust the limit as needed
            System.out.print(num * i + " ");
        }
    }
}

//================QUESTION C================
public class practical5 { //ArithmeticSeries
    public static void main(String[] args) {
        int start = 6;
        int diff = 5;
        
        for (int i = 0; i < 10; i++) { // Adjust the limit as needed
            System.out.print(start + " ");
            start += diff;
        }
    }
}

//================QUESTION D================
public class practical5 { //FibonacciSeries
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, count = 10; // Adjust the count as needed
        
        System.out.print(n1 + " " + n2); // Print first two numbers
        
        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}


//==========================QUESTION 3=========================
//================QUESTION A================
import java.util.Scanner;

public class practical5 { //ArmstrongNumber
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) { // Loop for 3 test cases
            System.out.print("Enter a three-digit number: ");
            int number = scanner.nextInt();
            
            int originalNumber = number;
            int sum = 0;
            
            while (number != 0) {
                int digit = number % 10;
                sum += digit * digit * digit;
                number /= 10;
            }
            
            if (sum == originalNumber) {
                System.out.println(originalNumber + " is an Armstrong number.");
            } else {
                System.out.println(originalNumber + " is not an Armstrong number.");
            }
        }
    }
}

//================QUESTION B================
import java.util.Scanner;
public class practical5 { //PalindromeNumber
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) { // Loop for 3 test cases
            System.out.print("Enter a three-digit number: ");
            int number = scanner.nextInt();
            
            int originalNumber = number;
            int reversedNumber = 0;
            
            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            
            if (originalNumber == reversedNumber) {
                System.out.println(originalNumber + " is a palindrome number.");
            } else {
                System.out.println(originalNumber + " is not a palindrome number.");
            }
        }
    }
}

//================QUESTION C================
import java.util.Scanner;

public class practical5 { //PerfectNumber
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) { // Loop for 3 test cases
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            int sum = 0;
            
            for (int j = 1; j <= number / 2; j++) {
                if (number % j == 0) {
                    sum += j;
                }
            }
            
            if (sum == number) {
                System.out.println(number + " is a perfect number.");
            } else {
                System.out.println(number + " is not a perfect number.");
            }
        }
    }
}


//==========================QUESTION 4=========================
import java.util.Scanner;

public class practical5 { //Sum Of First And Last Digits
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            
            // Extract the last digit
            int lastDigit = N % 10;
            
            // Extract the first digit
            int firstDigit = N;
            while (firstDigit >= 10) {
                firstDigit /= 10;
            }
            
            // Calculate the sum of the first and last digits
            int sum = firstDigit + lastDigit;
            
            // Print the result for the current test case
            System.out.println(sum);
        }
    }
}