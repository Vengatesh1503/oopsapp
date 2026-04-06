/**
 * Java application that accepts a name as an argument 
 * and displays a personalized greeting.
 */
public class HelloUser {
    public static void main(String[] args) {
        // Check if an argument was provided to avoid an ArrayIndexOutOfBoundsException
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello " + name);
        } else {
            // Fallback if no name is provided
            System.out.println("Hello World");
        }
    }
}
