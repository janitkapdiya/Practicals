public class practical1 //swapclass
{
    public static void main(String[] args){ 
        int x = 20;
        int y = 40;
        System.out.println("Before swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}