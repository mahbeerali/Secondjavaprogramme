public class Turnery {
    static int number1 = 4;
    static int number2 = 5;
    // conditional operator is a Turnery operator
    // condition ? value if true : value if false
    public static void main(String args[]) {
        String x = (number1 % 2 == 0) ? "Even" : "Odd";
        String y = (number2 % 2 == 0) ? "Even" : "Odd";

        {
            System.out.println("number1= " + x);
        }
        {System.out.println("number2= " + y);
    }

    }}