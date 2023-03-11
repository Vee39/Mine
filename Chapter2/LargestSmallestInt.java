import java.util.Scanner;

public class LargestSmallestInt{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter an integer: ");
int num1 = input.nextInt();

System.out.print("Enter an integer: ");
int num2 = input.nextInt();

System.out.print("Enter an integer: ");
int num3 = input.nextInt();

System.out.print("Enter an integer: ");
int num4 = input.nextInt();

System.out.print("Enter an integer: ");
int num5 = input.nextInt();

int smallest;
int largest;

if(num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
smallest = num1;
}
else if(num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5){
smallest = num2;
}
else if(num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
smallest = num3;
}
else if(num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
smallest = num4;
}else{
smallest = num5;
}

if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
largest = num1;
}
else if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
largest = num2;
}
else if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
largest = num3;
}
else if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
largest = num4;
}else{
largest = num5;
}

System.out.printf("The largest and smallest numbers are %d and %d%n", largest, smallest);

}
}