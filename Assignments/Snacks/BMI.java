import java.util.Scanner;

public class BMI{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter weight in pounds: ");
double weight = input.nextDouble() * 0.45359237;

System.out.print("Enter height in inches: ");
double height = input.nextDouble() * 0.0254;
double kilo = height*height;

double result = weight/kilo;

System.out.println("BMI is: "+ String.format("%.4f",result));
}
}