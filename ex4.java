
import java.util.Scanner;
//Created by Urvin Thummar
// ID NO 21CE145
public class ex4{
    private int id;

    private double balance = 500;

    private double annualInterestRate = 7;

    String dateCreated;

    ex4()
    {
        int id;
        double balance = 500;
        double annualInterestRate = 7;
    }
    ex4(int x,double y)
    {
        int id =x;
        double balance = y;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getid() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getbalance() {
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateCreated() {
        return dateCreated;
    }


    public double getMonthlyInterest()
    {
        return annualInterestRate/12;
    }

    public double  getMonthlyInterest(double balance)
    {
        return balance*(annualInterestRate/12);
    }
    public void withDrawl(double lwbalance)
    {
        balance = balance - lwbalance ;
        if(balance > lwbalance)
        {
            System.out.println("your amount is successfully debited");
        }
        else{
            System.out.println("your transaction is fail");
        }

    }

    public void deposit(double ldbalance)
    {
        balance=balance + ldbalance;
        System.out.println("your amount is successfully credited");
    }

}
class SavingAccount extends ex4
{

    void swithdraw(double sw_amount) {
        super.withDrawl(sw_amount);
    }


    void sdeposit(double sd_amount) {
        super.deposit(sd_amount);
    }
}

class CheckingAccount extends ex4
{

    void cwithdraw(double cw_amount) {
        if(cw_amount>100)
        {
            super.withDrawl(cw_amount);
        }
        else
        {
            System.out.println("minimum withdraw limit is 100 !!! ");
        }

    }


    void cdeposit(double cd_amount) {
        if(cd_amount>200)
        {
            super.deposit(cd_amount);
        }
        else
        {
            System.out.println("minimum deposit limit is 200 !!! ");
        }

    }
}


