import java.util.Scanner;

public class main5 {


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
            // System.out.println("-------------------------------------");
            System.out.println("MonthlyInterestRate : "+obj.getMonthlyInterest()+"%");
            System.out.println("MonthlyInterest  : "+obj.getMonthlyInterest(obj.getbalance()));
            //System.out.println("-------------------------------------");
            System.out.print("Enter deposit amount : ");
            double pa= sc.nextDouble();
            // System.out.println("-------------------------------------");
            obj.deposit(pa);
            System.out.println("Now your account balance : "+obj.getbalance());
            // System.out.println("-------------------------------------");
            System.out.print("Enter withdraw amount : ");
            double tel= sc.nextDouble();
            // System.out.println("-------------------------------------");
            obj.withDrawl(tel);
            System.out.println("Now your account balance : "+obj.getbalance());
            // System.out.println("-------------------------------------");
            System.out.println("");
        }
    }

