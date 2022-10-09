public class Percentage {
    static int total;
    static double percentage;
    public static void studentResult(String name,  int roll, int maths, int english, int science){
        total=maths+english+science;
        percentage=total/3;
        System.out.println(name + roll  + " total marks =" + total + " & percentage =" + percentage);
    }



    public static void main(String args[]){
        studentResult("john", 3, 55, 65, 75);
        if (percentage>=35)
        {System.out.println("pass");}
        else
        {System.out.println("fail");

    }
}}
