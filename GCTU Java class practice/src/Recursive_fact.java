import java.util.Scanner;

public class Recursive_fact {
    public static long factorial(long number) {
        if (number > 0) {
            // (10+9), (19 +8) , (27 + 7) , (34+ 6) ,(40+5) ,  (45 +4) , (49 + 3),( 52 +2), (54+1) , (55 +0)
            return number * factorial(number - 1);
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter your number to be factorialed: ");
        Scanner input = new Scanner(System.in);
        long user = input.nextLong();
       // factorial(user);
        long result = factorial(user);
        System.out.println("The factorial of " + user +" is " + result + "\nThank you");
    }
}
