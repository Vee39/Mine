import java.util.Scanner;

public class CostOfDriving{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the driving distance: ");
double distance = input.nextDouble();

System.out.print("Enter the miles per gallon: ");
double miles = input.nextDouble();

System.out.print("Enter the price per gallon: ");
double price = input.nextDouble();

double result = (distance/miles) * price;
System.out.println("The cost of driving is $"+ String.format("%.2f",result));
}
}


