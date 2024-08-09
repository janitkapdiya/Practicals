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
