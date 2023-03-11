import java.util.Scanner;

public class Arithmetic{

public static void main(String[] args){
Scanner input = new Scanner(System.in);
int a,b;

System.out.print("Enter an integer: ");
a = input.nextInt();

System.out.print("Enter another number: ");
b = input.nextInt();

int asqr = a * a;
int bsqr = b * b;

System.out.printf("Square of %d and %d is: %d and %d%n", a, b, asqr, bsqr);
System.out.printf("The sum of %d and %d is: %d%n", asqr, bsqr, asqr + bsqr);
System.out.printf("The difference of %d and %d is: %d%n", asqr, bsqr, asqr - bsqr);
}
}