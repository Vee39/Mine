import java.util.Scanner;

public class ArithmeticSmallestLargest{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int num1 = input.nextInt();

System.out.print("Enter a number: ");
int num2 = input.nextInt();

System.out.print("Enter a number: ");
int num3 = input.nextInt();

int sum = num1 + num2 + num3;
int average = sum/3;
int product = num1 * num2 * num3;
int smallest;
int largest;

if(num1 < num2 && num1 < num3){
smallest = num1;
} 
else if(num3 < num2){
smallest = num3;
} else{
smallest = num2;
}

if(num1 > num2 && num1 > num3){
largest = num1;
}
else if(num3 > num2){
largest = num3;
} else{
largest = num2;
}

System.out.printf("The sum of %d %d and %d is: %d%n", num1, num2, num3, sum);
System.out.printf("The average is %d%n", average);
System.out.printf("The product is %d%n", product); 
System.out.printf("The smallest number is %d%n", smallest);
System.out.printf("The largest number is %d%n", largest);

}
}