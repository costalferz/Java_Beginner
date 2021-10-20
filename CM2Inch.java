import java.util.Scanner;

public class CM2Inch {
    public static void main(String[] args) {
        Scanner Object = new Scanner(System.in);
        System.out.print("Enter your inch: ");
        float cm = Object.nextFloat();
        Object.close();
        double inch = cm * 0.39370079;
        System.out.printf("%.3f",inch);
    }

}