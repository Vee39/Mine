import java.util.Scanner;

public class FutureInvestmentValue{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Input investment amount: ");
double investmentAmt = input.nextDouble();

System.out.print("Enter annual interest rate: ");
double annualInterest = input.nextDouble();

System.out.print("Enter number of years: ");
int noOfYears = input.nextInt();

//double futureInvestmentValue = investmentAmt*Math.pow((1 + annualInterest/100), noOfYears);
double futureInvestmentValue = investmentAmt*((1 + annualInterest/100)* noOfYears);
System.out.print("Accumulated value is: "+ String.format("%.2f",futureInvestmentValue));

}
}