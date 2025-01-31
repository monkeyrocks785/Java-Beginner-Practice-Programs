public class fibonnacci {

    public static void main(String[] args) {
        int a = 0, b = 1, c, index = 10;
        System.out.println("Fibonacci Series : ");
        System.out.println(" " + a);
        System.out.println(" " + b);
        for (int i = 2; i < (index + 1); i++) {
            c = a + b;
            System.out.println(" " + c);
            a = b;
            b = c;  
        }
    }
}