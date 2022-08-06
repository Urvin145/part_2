
class atm {

    private int id;

    private double balance = 500;

    private double annualInterestRate = 7;

    String dateCreated;

    atm(String ac003)
    {
        int id;
        double balance = 500;
        double annualInterestRate = 7;
    }
    atm(int x,double y)
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
    void moneytransfer(atm x,double mta)
    {
        if(getbalance()<mta)
        {
            System.out.println("Your account dose not have demanded amount !!!");
        }
        else {
            double xb= x.getbalance()+mta;
            double b= getbalance()-mta;
            setBalance(b);
            x.setBalance(xb);
            System.out.println("money transfer successfully !!!");
        }


    }
}