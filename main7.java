import java.util.Scanner;

public class main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER YOUR ID : ");
        int aid = sc.nextInt();
        Account obj = new Account();
        System.out.println("-----Your Account is Successfully created-----");
        System.out.println("Your Id is : "+obj.getid());
        System.out.println("Your Amount Is :"+obj.getbalance());
        System.out.print("Enter annualInterestRate : ");
        double annualInterestRate= sc.nextDouble();
        obj. setAnnualInterestRate(annualInterestRate);
        System.out.println("MonthlyInterestRate : "+obj.getMonthlyInterest()+"%");
        System.out.println("MonthlyInterest  : "+obj.getMonthlyInterest(obj.getbalance()));
        System.out.print("Enter deposit amount : ");
        double pa= sc.nextDouble();
        obj.deposit(pa);
        System.out.println("Now your account balance : "+obj.getbalance());
        System.out.print("Enter withdraw amount : ");
        double tel= sc.nextDouble();
        obj.withDrawl(tel);
        System.out.println("Now your account balance : "+obj.getbalance());
        System.out.println("");


        System.out.println("** For Saving Account **");
        SavingAccount sobj = new SavingAccount();
        System.out.print("Enter deposit amount         : ");
        double p = sc.nextDouble();
        sobj.sdeposit(p);
        System.out.println("Now your account balance   : " + sobj.getbalance());

        System.out.print("Enter Withdraw amount         : ");
        double q = sc.nextDouble();
        sobj.swithdraw(q);
        System.out.println("Now your account balance   : " + sobj.getbalance());

        System.out.println("** For Checking Account **");
        CheckingAccount cobj = new CheckingAccount();
        System.out.print("Enter deposit amount         : ");
        double i = sc.nextDouble();
        cobj.cdeposit(i);
        System.out.println("Now your account balance   : " + cobj.getbalance());

        System.out.print("Enter Withdraw amount         : ");
        double o = sc.nextDouble();
        cobj.cwithdraw(o);
        System.out.println("Now your account balance   : " + cobj.getbalance());
    }
}
