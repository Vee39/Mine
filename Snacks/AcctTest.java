import java.util.Scanner;

public class AcctTest{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
Acct user1 = new Acct("Joy Peter", 50.00);
Acct user2 = new Acct("Esther", 0.00);

System.out.println(user1.getName() +" balance: "+ user1.getBalance());
System.out.println(user2.getName() +" balance: "+ user2.getBalance());

System.out.print("Enter deposit amount for account1: ");
double deposit = input.nextDouble();

System.out.println("Adding "+deposit+ " to "+ user1.getName()+" account balance");
user1.depositAmt(deposit);

System.out.print("Enter deposit amount for account2: ");
deposit = input.nextDouble();

System.out.println("Adding "+deposit+ " to "+user2.getName()+" account balance");
user2.depositAmt(deposit);

System.out.println(user1.getName() + " balance: "+ user1.getBalance());
System.out.println(user2.getName() + " balance: "+ user2.getBalance());
}
}