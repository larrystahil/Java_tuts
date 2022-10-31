//Question 4
//Code for calculating for the Discounted price for a product
import java.util.Scanner;

public class Discount_app {

    public static void main(String[] args){
        System.out.println("*******************************\nA Discount Calculating Program\n*******************************");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Original of the your product(GH): ");
        float originalPrice = input.nextFloat();
        System.out.print("Enter the Discount percentage(%): ");

        float discPercent = input.nextFloat();
        float newSellingPrice = originalPrice - (originalPrice * discPercent/100);

        System.out.println("The Price of the Product is: GH" + originalPrice + " and Discount percentage is: " + discPercent + "%\nYour new product price based on the discount is: GH" + newSellingPrice + "\nBye!!!");
        }
    }

