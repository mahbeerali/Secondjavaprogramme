import java.util.Scanner;

public class Grade {


    public static void main(String [] args)
    {

        System.out.println("Enter your marks;-");
        Scanner scanner = new Scanner(System.in);
         int marks= scanner.nextInt();
        if (marks >= 70)
        {
            System.out.println("Distinction");
        } else if (marks >=60)
        {
            System.out.println("First class");

        }else if (marks >=35) {
            System.out.println("Passed");}
        else
        {System.out.println("failed");
        }
    }

    }

