import java.util.Scanner;

public class HeartRateTest{

public static void main(String[] args){
Scanner input = new Scanner(System.in);
HeartRate user = new HeartRate("Jiggy","Jagga",3,27,1992);

System.out.println(user.getName() +" "+user.getLastName()+". Born on "+user.getMonth()+"/"+ user.getDay()+ "/"+user.getYearOfBirth());
System.out.println("You are approximately "+user.age()+" of age");
System.out.println("Your maximum heart rate is: "+ user.maxHeartRate());
System.out.println("Your target heart-rate-range is: Max heart-rate-range "+ user.maxHeartRateRange()+". Min heart-rate-range "+user.minHeartRateRange());
 
}

}