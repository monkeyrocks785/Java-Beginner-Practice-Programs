import java.util.*;

public class factorial {

    static int factorialOfNum(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorialOfNum(n - 1));
        }
    }

    public static void main(String[] args) {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        fact = factorialOfNum(a);
        System.out.println("Factorial of " + a + " is " + fact);
        sc.close();
    }
}
