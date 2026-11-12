//فاطمه ابراهيم عبدالشافي رقم الجامعي 2320231082
package d;

public class account {
    private String name ;
    private double balance;
public static double  yearlyInterestRate;
 public  account ( ){
        name ="myaccount ";
        balance=5000.0;
    }
  public  account ( String name,double balance){
   this. name =name;
    this. balance=balance;
    }
    
      public void setName(String name){
     this.name=name;
    }
    public String getName(){
        return name;
    }
  
  public void setBalance(double balance){
    if(balance>0){
   this. balance=balance;
    }
    else{
     System.out.println("can't negative"); }
  }
  
    public double getBalance(){
     
      
    return balance;
    }
  
   
    public void withdraw ( double amount){
  if (amount <balance){
    balance-=amount;
  }  else
        System.out.println("Insufficient balance");
      
    }
        
   
      public void depositAmount( double amount){
       balance+=amount;
   }
    public void calculateMonthlyInterest() {
       balance += (balance * yearlyInterestRate) / 12;
        
    }
      
    public static void editYearlyInterestRate(double newRate) {
        if (newRate > 0) {
            yearlyInterestRate = newRate;
        }
    }
public String toString(){
       return ( name +" "+balance);
}
    
 

}
//فاطمه ابراهيم عبدالشافي رقم الجامعي 2320231082
      
    



    