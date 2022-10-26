import java.util.Scanner;

public class Even_or_odd {
    public static void main(String[] args){

        System.out.println("Enter any positive number To determine whether it is Odd or Even.");
        Scanner user = new Scanner(System.in);
        int number = user.nextInt();

        if ((number % 2) == 0){
            System.out.println("The number you entered is an even number");
        }
        else {
            System.out.println("The number you entered is an odd number");
        }
    }
}