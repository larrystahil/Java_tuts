/*Question 1.
        Write a simple Java program to display student grade when the exam score is inputed.
        Answer:*/
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        int score;
        System.out.print("Enter your Score: ");
        Scanner user = new Scanner(System.in);
        score = user.nextInt();
        if (score >= 75 && score <= 100) {
            System.out.println("Your score is " + score + "." + " You've been graded A, yie yie !!");
        } else if (score >= 60 && score <= 74) {
            System.out.println("Your score is " + score + "." + " You've done well!!, graded B, Alaaaa !!");
        } else if (score >= 55 && score <= 59) {
            System.out.println("Your score is " + score + "." + " You've done well!!, graded C, It's ok, great!!");
        } else if (score >= 45 && score <= 54) {
            System.out.println("Your score is " + score + "." + " You've been graded D, Eii, you force ooo errh !!");
        } else if (score >= 0 && score <= 44) {
            System.out.println("Your score is " + score + "." + " You've been graded F, Wa bon papa !!, Sua ade");
        } else {
            System.out.println("Don't even know what to say, try again later please, wrong number inputted, Thank you");
        }
    }
}