import java.util.*;

public class avgsumfinder {
    public static void main(String[] args) {
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        float arr[] = new float[n];
        System.out.println("Enter " + n + " array elements : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value : ");
            arr[i] = sc.nextInt();
            sum = sum+arr[i];
        }
        float avg = sum/n;
        System.out.println("Average : " + avg);
        System.out.println("Sum : " + sum);
        sc.close();
    }
}


