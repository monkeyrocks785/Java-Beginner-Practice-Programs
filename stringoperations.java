public class stringoperations {
    public static void main(String[] args) {
        String myStr1 = "Hello World";
        String myStr2 = "Hello World";
        String myStr3 = "Hello Monkey";

        System.out.println(myStr1.equals(myStr2));
        System.out.println(myStr1.equals(myStr3));


        StringBuilder sb = new StringBuilder(myStr1);
        sb.reverse();
        System.out.println(sb.toString());

        System.out.println(myStr3.toUpperCase());
        System.out.println(myStr3.toLowerCase());

        String firstName = "Monkey";
        String lastName = "Coder";
        System.out.println(firstName.concat(lastName));
    }
}