import java.util.Scanner;

public class Acceleration{

public static void main(String[] args){
Scanner userInput = new Scanner(System.in);

System.out.print("Enter starting velocity: ");
double v0 = userInput.nextDouble();

System.out.print("Enter ending velocity: ");
double v1 = userInput.nextDouble();

System.out.print("Enter time span in seconds: ");
double t = userInput.nextDouble();

double result = (v1 - v0)/t;
System.out.println("The average acceleration is: "+ String.format("%.4f",result));
}
}