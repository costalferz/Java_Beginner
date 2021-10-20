import java.util.Scanner;

public class CircleAreaFinder {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your radius");
        float radius = object.nextFloat();
        int pi = 22/7;
        float Area;
        Area = radius*radius*pi;
        System.out.printf("%.3f, %f",Area);

    }
    
}