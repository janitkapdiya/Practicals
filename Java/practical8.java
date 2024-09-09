//==========================QUESTION 1=========================
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        double average = sum / 10.0;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}


//==========================QUESTION 2=========================
import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int evenCount = 0, oddCount = 0;

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Even numbers: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                evenCount++;
            }
        }

        System.out.println("\nOdd numbers: ");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                oddCount++;
            }
        }

        System.out.println("\nTotal even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
    }
}

//==========================QUESTION 3=========================
import java.util.Scanner;
import java.util.Arrays;

public class SearchDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        // Searching an element
        System.out.println("Enter number to search: ");
        int search = sc.nextInt();
        boolean found = false;

        for (int num : numbers) {
            if (num == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(search + " found in the array.");
        } else {
            System.out.println(search + " not found in the array.");
        }

        // Deleting an element
        System.out.println("Enter number to delete: ");
        int delete = sc.nextInt();
        int[] newArray = new int[numbers.length - 1];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != delete) {
                newArray[index++] = numbers[i];
            }
        }

        System.out.println("Array after deletion: " + Arrays.toString(newArray));
    }
}


//==========================QUESTION 4=========================
import java.util.Scanner;

public class IndiaQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Questions related to India
        String[] questions = {
            "What is the capital of India?",
            "Who is known as the 'Father of the Nation' in India?",
            "Which is the national animal of India?",
            "Which river is considered the holiest in India?",
            "Who was the first Prime Minister of India?"
        };

        // Options for each question
        String[][] options = {
            {"1. Mumbai", "2. New Delhi", "3. Kolkata", "4. Chennai"},
            {"1. Jawaharlal Nehru", "2. B. R. Ambedkar", "3. Mahatma Gandhi", "4. Subhas Chandra Bose"},
            {"1. Tiger", "2. Elephant", "3. Peacock", "4. Lion"},
            {"1. Yamuna", "2. Ganga", "3. Godavari", "4. Brahmaputra"},
            {"1. Sardar Vallabhbhai Patel", "2. Lal Bahadur Shastri", "3. Indira Gandhi", "4. Jawaharlal Nehru"}
        };

        // Correct answers for the quiz (by option number)
        int[] correctAnswers = {2, 3, 1, 2, 4};

        int score = 0;

        // Loop to ask each question
        for (int i = 0; i < 5; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }
            System.out.print("Your answer (1-4): ");
            int answer = sc.nextInt();

            if (answer == correctAnswers[i]) {
                score++;
            }
        }

        // Calculate and display the score and percentage
        System.out.println("Your score: " + score + "/5");
        System.out.println("Percentage: " + (score * 100 / 5) + "%");
    }
}

//==========================QUESTION 5=========================
import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        // Sorting in ascending order
        Arrays.sort(numbers);
        System.out.println("Array in ascending order: " + Arrays.toString(numbers));

        // Sorting in descending order
        System.out.print("Array in descending order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}


//==========================QUESTION 6=========================
public class JaggedArray {
    public static void main(String[] args) {
        // Jagged array where each row can have a different number of columns
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
