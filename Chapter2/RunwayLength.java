import java.util.Scanner;

public class RunwayLength{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.printf("Enter take-off speed: ");
double v = input.nextDouble();

System.out.printf("Enter acceleration: ");
double a = input.nextDouble();

double length = ((v * v)/(a * 2));

System.out.printf("The minimum runway length for this airplane is: %f%n", length);


}
}