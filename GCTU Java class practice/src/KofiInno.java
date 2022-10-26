//-------------- Converting Pounds in Kilograms ---------------
import java.util.*;
import java.util.Scanner;
public class KofiInno {
    static final double constant= 0.454;
    public static void main(String[] args) {
        double kg,lbs;
        System.out.print("Converting Pounds into Kilograms\n**********************************************\nWeight in Pounds (lbs): ");
        Scanner input = new Scanner(System.in);
        lbs = input.nextDouble();
        System.out.print("Converted Weight in Kilograms (kg): "+ lbs * constant);

    }
}
