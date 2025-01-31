import java.util.*;

public class rectangleareaperimeterfinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        double length = sc.nextInt();
        System.out.println("Enter the width of the rectangle : ");
        double width = sc.nextInt();

        double area = length * width;
        System.out.println("Area : " + area);

        double perimeter = 2 * (length + width);
        System.out.println("Perimeter : " + perimeter);

        sc.close();
    }

}
