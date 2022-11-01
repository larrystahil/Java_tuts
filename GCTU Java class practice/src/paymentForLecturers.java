import java.util.Scanner;
public class paymentForLecturers {


    final static int bonus = 500;
    final static double hrRate= 100;
    final static double welfarePerMnth = 70;

    public static void main(String[]args){
        double  grossPay, hrsPerMnth, salary, bonusPay, VAT;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Hours you worked in a Month: ");
        hrsPerMnth = input.nextInt();
        grossPay = hrRate * hrsPerMnth;
        bonusPay = grossPay + bonus;
        VAT= (17.5/100) * grossPay;
        double deduction = VAT + welfarePerMnth;
        salary = bonusPay - deduction;

        //System.out.println(grossPay + " salary is "+ salary);


        if (hrsPerMnth > 20){
            bonusPay = grossPay + bonus;
            salary = bonusPay - deduction;
            System.out.println("Your Hours worked in the month is "+ hrsPerMnth+ " hours and Salary with bonus for extra hours is GHC "+ salary);
        }
        else {
            salary = grossPay - deduction;
            System.out.println("Your Hours worked in the month is "+ hrsPerMnth+" hours Salary is GHC "+ salary);
        }




    }
}