import java.util.Scanner;

public class CalculateInterest{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter balance: ");
int balance = input.nextInt();

System.out.print("Enter interest rate: ");
double interestRate = input.nextDouble();

double interest = balance *(interestRate/1200);
System.out.printf("The interest is: %f%n", interest);

}
}