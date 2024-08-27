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

