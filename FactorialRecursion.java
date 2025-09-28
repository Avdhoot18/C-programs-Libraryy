import java.util.Scanner;

public class FactorialRecursion {
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (<=20): ");
        int n = sc.nextInt();

        if (n < 0 || n > 20) {
            System.out.println("Invalid input (0-20 only)");
        } else {
            System.out.println("Factorial(" + n + ") = " + factorial(n));
        }
    }
}
