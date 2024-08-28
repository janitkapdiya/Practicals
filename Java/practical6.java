//==========================QUESTION 1=========================
//================Program Using a Function Without Parameters================
import java.util.Scanner;
public class practical6 { //EvenOddCounter
    public static void countEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
    }

    public static void main(String[] args) {
        countEvenOdd();
    }
}


//================Program Using a Function With Parameters================
import java.util.Scanner;

public class practical6 {//EvenOddCounter
    public static void countEvenOdd(int[] numbers) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        countEvenOdd(numbers);
    }
}

//==========================QUESTION 1=========================

//================QUESTION A================
//=========Program Using a Function Without Parameters=========
import java.util.Scanner;
public class practical6 { //PrimeNumber
    public static void findPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        findPrime();
    }
}

//=========Program Using a Function With Parameters=========
public class practical6 { //PrimeNumber
    public static void findPrime(int num) {
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        findPrime(29); // Replace with any number to check
    }
}


//================QUESTION B================
//=========Program Using a Function Without Parameters=========
import java.util.Scanner;

public class practical6 { //DigitAddition
    public static void digitAddition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int num = scanner.nextInt();
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }

    public static void main(String[] args) {
        digitAddition();
    }
}

//=========Program Using a Function With Parameters=========
public class practical6 { //DigitAddition
    public static void digitAddition(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }

    public static void main(String[] args) {
        digitAddition(12345); // Replace with any five-digit number
    }
}



//================QUESTION C================
//=========Program Using a Function Without Parameters=========
import java.util.Scanner;

public class practical6 { //InterestCalculator
    public static void calculateInterest() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time (years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
    }

    public static void main(String[] args) {
        calculateInterest();
    }
}

//=========Program Using a Function With Parameters=========
public class practical6 { //InterestCalculator
    public static void calculateInterest(double principal, double rate, double time) {
        double simpleInterest = (principal * rate * time) / 100;
        double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
    }

    public static void main(String[] args) {
        calculateInterest(10000, 5, 2); // Replace with appropriate values
    }
}


//================QUESTION D================
//=========Program Using a Function Without Parameters=========
import java.util.Scanner;

public class practical6 { //ReverseNumber
    public static void reverseNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number: " + reversed);
    }

    public static void main(String[] args) {
        reverseNumber();
    }
}


//=========Program Using a Function With Parameters=========
  public class practical6 { //ReverseNumber
      public static void reverseNumber(int num) {
          int reversed = 0;

          while (num != 0) {
              int digit = num % 10;
              reversed = reversed * 10 + digit;
              num /= 10;
          }

          System.out.println("Reversed number: " + reversed);
      }

      public static void main(String[] args) {
          reverseNumber(12345); // Replace with any number
      }
  }


//================QUESTION E================
//=========Program Using a Function Without Parameters=========
import java.util.Scanner;

public class practical6 { //SwapNumbers
    public static void swapNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap, first number: " + a + ", second number: " + b);
    }

    public static void main(String[] args) {
        swapNumbers();
    }
}

//=========Program Using a Function With Parameters=========
public class practical6 { //SwapNumbers
    public static void swapNumbers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap, first number: " + a + ", second number: " + b);
    }

    public static void main(String[] args) {
        swapNumbers(10, 20); // Replace with any two numbers
    }
}

//================Menu Driven Program================
import java.util.Scanner;

public class practical6{ //MenuDrivenProgram 

    // Method to find if a number is prime
    public static void findPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    // Method to find the sum of digits of a number
    public static void digitAddition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int num = scanner.nextInt();
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }

    // Method to calculate simple and compound interest
    public static void calculateInterest() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time (years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
    }

    // Method to reverse a number
    public static void reverseNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number: " + reversed);
    }

    // Method to swap two numbers
    public static void swapNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Swapping without using a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap, first number: " + a + ", second number: " + b);
    }

    // Main method to display menu and perform operations based on user choice
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display the menu
            System.out.println("\nMenu:");
            System.out.println("1. Find Prime Number");
            System.out.println("2. Find Digit Addition");
            System.out.println("3. Find Simple and Compound Interest");
            System.out.println("4. Find Reverse Number");
            System.out.println("5. Swap Two Numbers");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Perform operation based on user choice
            switch (choice) {
                case 1:
                    findPrime();
                    break;
                case 2:
                    digitAddition();
                    break;
                case 3:
                    calculateInterest();
                    break;
                case 4:
                    reverseNumber();
                    break;
                case 5:
                    swapNumbers();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }
}

//================QUESTION 3================
//================Student Records================
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    String className;
    String semester;
    String subject;
    int examFee;

    public Student(int rollNo, String name, String className, String semester, String subject, int examFee) {
        this.rollNo = rollNo;
        this.name = name;
        this.className = className;
        this.semester = semester;
        this.subject = subject;
        this.examFee = examFee;
    }

    @Override
    public String toString() {
        return rollNo + " " + name + " " + className + " " + semester + " " + subject + " " + examFee;
    }
}

public class practical6 { //StudentRecords

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        // Recording student information
        System.out.print("Enter how many records you want to store: ");
        int numberOfRecords = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        for (int i = 0; i < numberOfRecords; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // consume the newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Class: ");
            String className = scanner.nextLine();
            System.out.print("Semester: ");
            String semester = scanner.nextLine();
            System.out.print("Subject: ");
            String subject = scanner.nextLine();
            System.out.print("Exam Fee: ");
            int examFee = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            students.add(new Student(rollNo, name, className, semester, subject, examFee));
        }

        // Displaying all student records
        System.out.println("\nStored Student Records:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Searching student information
        System.out.println("\nSearch Student Record by:");
        System.out.println("1. Roll Number");
        System.out.println("2. Name");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        if (choice == 1) {
            System.out.print("Enter Roll Number: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // consume the newline
            searchByRollNo(students, rollNo);
        } else if (choice == 2) {
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            searchByName(students, name);
        } else {
            System.out.println("Invalid choice!");
        }
    }

    // Method to search by Roll Number
    private static void searchByRollNo(List<Student> students, int rollNo) {
        for (Student student : students) {
            if (student.rollNo == rollNo) {
                System.out.println("Student Record Found: " + student);
                return;
            }
        }
        System.out.println("No student found with Roll Number " + rollNo);
    }

    // Method to search by Name
    private static void searchByName(List<Student> students, String name) {
        boolean found = false;
        for (Student student : students) {
            if (student.name.equalsIgnoreCase(name)) {
                System.out.println("Student Record Found: " + student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No student found with Name " + name);
        }
    }
}