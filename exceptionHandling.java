class Exception {

    public void divide(int a, int b)throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        else {
            System.out.println("Result: " + a/b);
        }
    }
}

public class exceptionHandling {

    public static void main(String[] args) {
        Exception obj = new Exception();
        try {
            obj.divide(10, 0);
        }
        catch(ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
        System.out.println("Program continues...");
    }
}

