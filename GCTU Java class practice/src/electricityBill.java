/*Question 1
--A program that finds the electricity bills in months
 */

public class electricityBill{
    public static void main(String[] args) {
        double consumption = 350 * 24 * 30;
        double kw = consumption/1000;
        double billing = kw * 2;

        System.out.println("Your bill is: "+billing);

    }

}
