import java.util.Scanner;

public class circumference {

    // Function to return circumference
    static double circumference(double radius) {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double result = circumference(r);

        System.out.println("Circumference = " + result);

        sc.close();
    }
}