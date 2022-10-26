import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        int number = user.nextInt();

        if ((number % 2) == 1){
            System.out.println("The number is a prime Number. Thanks");
        }
        else {
            System.out.println("Sorry, This is not a Prime Number, \n" +
                    "Try again next time.");
        }

    }
}