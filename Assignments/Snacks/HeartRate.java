
public class HeartRate{

private String name, lastName;
private int month, day, yearOfBirth;

public HeartRate(String name, String lastName, int month, int day, int yearOfBirth){
this.name = name;
this.lastName = lastName;
this.month = month;
this.day = day;
this.yearOfBirth = yearOfBirth;
}

public void setName(String name){
this.name = name;
}

public void setLastName(String lastName){
this.lastName = lastName;
}

public void setMonth(int month){
this.month = month;
}

public void setDay(int day){
this.day = day;
}

public void setYearOfBirth(int yearOfBirth){
this.yearOfBirth = yearOfBirth;
}

public String getName(){
return name;
}

public String getLastName(){
return lastName;
}

public int getMonth(){
return month;
}

public int getDay(){
return day;
}

public int getYearOfBirth(){
return yearOfBirth;
}

public int age(){
int years = 2023 - getYearOfBirth();
return years;
}

public int maxHeartRate(){
return 220 - age();
}

public double minHeartRateRange(){
return maxHeartRate() * 50;
}

public double maxHeartRateRange(){
return maxHeartRate() * 85/100;
}

}