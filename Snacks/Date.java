import java.util.Scanner;
public class Date{

    public static void main(String[] Strings) {
Scanner input = new Scanner(System.in);

int minutesInYear = 60 * 24 * 365;
System.out.print("Input the number of minutes: ");
int min = input.nextInt();
int years = (int) (min / minutesInYear);
int days = (int) (min / 60 / 24) % 365;
System.out.println( min + " minutes is approximately " + years + " years and " + days + " days");
    }
}