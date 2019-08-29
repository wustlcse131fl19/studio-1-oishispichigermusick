package studio1;
import support.cse131.ArgsProcessor;


public class Average {
    public static void main(String[] args){
        ArgsProcessor ap = new ArgsProcessor(args);
        double n1 = ap.nextDouble("The first of two numbers to be averaged?");
        double n2 = ap.nextDouble("The second of two numbers to be averaged?");
        double average = ((n1 + n2) / 2);
        System.out.println("The average is: " + average);
    }
}
