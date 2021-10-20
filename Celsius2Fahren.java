import java.util.Scanner;

public class Celsius2Fahren {
    public static void main(String[] args) {
        float Fahren;
        Scanner Object = new Scanner(System.in);
        System.out.println("Enter your Celsius need to covert:");
        float Celsius = Object.nextFloat();
        Object.close();
        Fahren = (Celsius*9/5)+32;
        System.out.print(Math.floor(Fahren));
    }
}
