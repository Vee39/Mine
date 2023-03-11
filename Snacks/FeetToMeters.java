import java.util.Scanner;

public class FeetToMeters{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter feet: ");
double feet = input.nextDouble();
double meter = 0.305;

double result = feet * meter;
System.out.print(feet + " feet is " + result + " meters");
}
}