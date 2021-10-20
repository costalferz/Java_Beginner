import java.util.Scanner;
public class helloname {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in); // Create a Scanner Object
        System.out.println("Enter your name");
        
        String userName = Obj.nextLine(); // Read user input
        System.out.println("Hello,"+userName); // Output
        
    }
    
}
