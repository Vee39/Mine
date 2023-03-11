import java.util.Scanner;

public class SumDigits{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

int remainder, sum = 0;

System.out.print("Enter a number between 0 and 1000: ");
int num = input.nextInt();
if(num < 0 || num > 1000){
System.out.print("Enter a number between 0 and 1000: ");
num = input.nextInt();
}

while(num > 0){
remainder = num % 10;
sum = remainder + sum;
num = num/10;
}

System.out.printf("Sum of digits is: %d%n", sum);

}
}