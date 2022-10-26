import java.util.Scanner;

public class Greates_num {
    public static void main(String[] args){
        int loop = 1;
        int num1, num2, num3;

        System.out.print("Enter first number: ");
        Scanner user = new Scanner(System.in);
        num1 = user.nextInt();

        System.out.print("\nEnter second number: ");
        Scanner user2 = new Scanner(System.in);
        num2 = user2.nextInt();

        System.out.print("\nEnter third number: ");
        Scanner user3 = new Scanner(System.in);
        num3 = user3.nextInt();

        if(num1 > num2 && num1 > num3){
           System.out.println(num1 + " is the Greatest among " + num2 + " and " + num3 );
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the Greatest among " + num1 + " and " + num3);
        }
        else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is the Greatest among " + num1 + " and " + num2);
        }
    }
}
