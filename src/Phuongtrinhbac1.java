import java.util.Scanner;

public class Phuongtrinhbac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("điền a:");
        a = sc.nextDouble();
        System.out.println("điền b:");
        b = sc.nextDouble();
        System.out.println("điền c:");
        c = sc.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
