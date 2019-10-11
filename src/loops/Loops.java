/*
 * Dylan Moore
 * Oct 11 2019
 * User prompted exponent calculator 
 */
package loops;
import java.util.Scanner;
/**
 *
 * @author dymoo6791
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("1 find value of number squared");
            System.out.println("2 find value of number cubed");
            System.out.println("3 find value of any number to any power");
            System.out.println("4 exit program");
            int option = in.nextInt();
            if (option == 1) {
                System.out.println("Enter a value to square"); //prompt user for value
                int valueOne = in.nextInt(); //user input
                System.out.println(Math.pow(valueOne, 2)); //square value inputed by user
                System.out.println("---------------------------------------");
                run = true; //return to begining of program
            } else if (option == 2) {
                System.out.println("Enter a value to Cubed"); //prompt user for value
                int valueOne = in.nextInt();//user input
                System.out.println(Math.pow(valueOne, 3)); //Cube value inputed by user
                System.out.println("---------------------------------------");
                run = true; //return to begining of program
            } else if (option == 3) {
                System.out.println("Enter a value"); //prompt user for value
                int valueOne = in.nextInt();
                System.out.println("Enter a exponent"); // prompt user for exponent
                int valueTwo = in.nextInt();
                System.out.println(Math.pow(valueOne, valueTwo));//display output based on user inputed values
                System.out.println("---------------------------------------");
                run = true; //return to begining of program
            } else if (option == 4) {
                System.out.println("Good bye");
                run = false; //end program
            }
        }
    }
}
