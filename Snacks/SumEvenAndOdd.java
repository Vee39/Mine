import java.util.Scanner;

public class SumEvenAndOdd{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int nums, integers, even = 0, odd = 0;

System.out.print("Enter number of integers: ");
nums = input.nextInt();

System.out.println("Enter "+ nums + " number of integers");
for(int i = 0; i < nums; i++){
integers = input.nextInt();
if(integers % 2 == 0){
even += integers;
}else{
odd += integers;
}
}

System.out.println("Sum of even numbers are: "+ even);
System.out.println("Sum of odd numbers are: "+ odd);

}
}