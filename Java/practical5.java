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

