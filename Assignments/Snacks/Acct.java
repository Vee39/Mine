public class Acct{
private String name;
private double balance;

public Acct(String name, double balance){
this.name = name;
if(balance > 0.0){
this.balance = balance;
}
}

public void setName(String name){
this.name = name;
}

public void depositAmt(double deposit){
if(deposit > 0.0){
balance = balance + deposit;
}
}

public String getName(){
return name;
}

public double getBalance(){
return balance;
}


}