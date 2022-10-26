import java.util.Scanner;

public class AreaOfCylinder {
    static final double constant = 3.142;

    public static double area(double radius){
        return (radius *radius)*constant;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("****************************************\nArea and Volume Of A Cylinder Application\n***************************************\n\nKindly Enter The Radius Of Your Cylinder: ");
        double useRadius = input.nextDouble();
        System.out.println("Enter Your length To Calculate The Volume in centimeter(cm): ");
        double userLenghth = input.nextDouble();
        double result1 = area(useRadius);
        double volume = result1 * userLenghth;
        System.out.print("The Area Of Your Cylinder Is: " + result1 + "cm And The Volume is: " + volume + "cm");
    }
}
