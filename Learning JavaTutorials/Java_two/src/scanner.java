import java.awt.*;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
      //  System.out.print("Enter A String Value: ");

        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        System.out.println(userNumber);
        double userNumber2 = sc.nextInt();
        System.out.println(userNumber2);

        /*String userInput = sc.next (); // Only displays the first word

        String uppercased = userInput.toUpperCase();
        System.out.println(userInput + " and " + uppercased);
        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

        System.out.println("Contains: is " + userInput.contains("Enter".toLowerCase()));*/
    }

}