import java.util.*;

class RandomInteger {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the min range : ");
        int min = sc.nextInt();
        System.out.println("Enter the max range : ");
        int max = sc.nextInt();

        int b = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Random number between " + min + " and " + max + " is " + b);

        boolean isPrime = true;

        for (int i = 2; i < b; i++) {
            if (b % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime == true) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }

        sc.close();
    }
}