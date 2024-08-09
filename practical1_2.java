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
