//فاطمه ابراهيم عبدالشافي رقم الجامعي 2320231082
package d;

import java.util.ArrayList;
public class Main {
    
    public static void main(String[] args) {
        
        account acc1 = new account();
        account acc2 = new account("Account2: ", 10000.0);
        
        ArrayList<account> a = new ArrayList<>();
        a.add(acc1);
        a.add(acc2);

        account.editYearlyInterestRate(0.05);
        System.out.println("Initial balances:");
        System.out.println(acc1);
        System.out.println(acc2);
        
      for (int i = 1; i <=12; i++) {
          System.out.println("month:" +i);
          acc1.calculateMonthlyInterest();
          System.out.println(acc1);
            acc2.calculateMonthlyInterest();
          System.out.println(acc2);
         
       
       }

        
        System.out.println("\nBalances after 12 months at 5% interest: ");
        System.out.println(acc1);
        System.out.println(acc2);
        
        System.out.println("\nPerforming deposit and withdrawal: ");
        acc1.depositAmount(1000);
        acc2.withdraw(10000);
        
        
        System.out.println("\nBalances after deposit and withdrawal:");
        System.out.println(acc1);
        System.out.println(acc2);

        
     account.editYearlyInterestRate(0.1);

        
        for (int i = 0; i < 12; i++) {
            acc1.calculateMonthlyInterest();
            acc2.calculateMonthlyInterest();
        }
        
        System.out.println("\nBalances after another 12 months at 10% interest:");
        System.out.println(acc1);
        System.out.println(acc2);
        

     
    
        }

        
    }
//فاطمه ابراهيم عبدالشافي رقم الجامعي 2320231082

        
        
        
        
    
