import java.util.Scanner;

class FactorialExample{
    public static void main(String args[]){
        int i,facto=1, number;//It is the number to calculate factorial
        System.out.print("Enter a number: ");
        Scanner user = new Scanner(System.in);
        number = user.nextInt();

        for(i=1;i<=number;i++){
            facto=facto*i;
        }
        System.out.println("Factorial of "+number+" is: "+facto);
    }
}