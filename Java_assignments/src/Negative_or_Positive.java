import java.util.Scanner;

public class Negative_or_Positive {
    public static void main (String[] args){
        System.out.println("Enter any number, either positive or negative :) :) :)");
        Scanner user = new Scanner(System.in);
        int number = user.nextInt();

        if (number >= 0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }

    }
}
