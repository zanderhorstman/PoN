import java.util.Scanner;

public class posOrNeg {
    public static void main(String[] args) {

        //Write a Java program to get a number from the user and print whether it is positive or negative.
        //Test Data
        //Enter a number: 35
        //35 is positive.


        //Variables//
        Scanner input = new Scanner(System.in);
        String num;

        //Input//

        System.out.print("Test Data\nEnter a number, positive or negative: ");
        num = input.nextLine();

        //Conditional//

        if (num.contains("-")) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println(num + " is positive.");
        }
    }
}
