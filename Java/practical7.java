//==========================QUESTION 1=========================
class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract one integer and one double
    public double subtract(int a, double b) {
        return a - b;
    }

    // Method to multiply two double values
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method to add two characters (will convert them to their ASCII values)
    public int add(char a, char b) {
        return a + b;
    }

    // Method to add two strings
    public String add(String a, String b) {
        return a + b;
    }

}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Addition of two integers
        System.out.println("Addition of two integers: " + calc.add(5, 10));

        // Subtraction of one integer and one double
        System.out.println("Subtraction of int and double: " + calc.subtract(10, 5.5));

        // Multiplication of two double numbers
        System.out.println("Multiplication of two doubles: " + calc.multiply(3.5, 2.0));

        // Addition of two characters
        System.out.println("Addition of two characters: " + calc.add('A', 'B'));

        // Addition of two string values
        System.out.println("Addition of two strings: " + calc.add("Hello ", "World!"));
    }
}


//==========================QUESTION 2=========================
import java.util.Scanner;

class Record {
    // Data members
    private String name;
    private String category;
    private String details;
    private int age;

    // Constructor
    public Record(String name, String category, String details, int age) {
        this.name = name;
        this.category = category;
        this.details = details;
        this.age = age;
    }

    // Method overloading: different ways to filter/display records
    public void displayRecord() {
        System.out.println("Name: " + name + ", Category: " + category + ", Details: " + details + ", Age: " + age);
    }

    public void displayRecord(String category) {
        if (this.category.equals(category)) {
            displayRecord();
        }
    }

    public void displayRecord(int age) {
        if (this.age == age) {
            displayRecord();
        }
    }

    // Getter methods for data members
    public String getCategory() {
        return category;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Record[] records = new Record[5];

        // Taking 5 records from the user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for record " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Category: ");
            String category = sc.nextLine();
            System.out.print("Details: ");
            String details = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // Consume newline
            records[i] = new Record(name, category, details, age);
        }

        // Display options
        System.out.println("Choose an option to display records:");
        System.out.println("1. Display all");
        System.out.println("2. Filter by category");
        System.out.println("3. Filter by age");

        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                for (Record record : records) {
                    record.displayRecord();
                }
                break;
            case 2:
                System.out.print("Enter category to filter: ");
                String category = sc.nextLine();
                for (Record record : records) {
                    record.displayRecord(category);
                }
                break;
            case 3:
                System.out.print("Enter age to filter: ");
                int age = sc.nextInt();
                for (Record record : records) {
                    record.displayRecord(age);
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}