import java.util.Scanner;

public class pos_neg_floats {
    public static void main (String[] args){
        System.out.println("Enter any number, either positive or negative :) :) :)");
        Scanner user = new Scanner(System.in);
        float number = user.nextFloat();
        int zero = 0;

        if (number > 0){
            System.out.println(number + "Hw3 wo Number nu y3 positive :) :), :)");
        }
        else if (number < 0 ){
            System.out.println(number + "Eii wei di3 negative oo :( :( :( :(");
        }
        else if (number == 0) {
            number = zero;
            System.out.println(zero + " is your number");
        }

    }
}