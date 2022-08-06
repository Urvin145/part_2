import java.util.ArrayList;
import java.util.Scanner;

public class main6 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
          ArrayList<atm> ID = new ArrayList<atm>(10);
            atm AC001 = new atm("AC001");
            atm AC002 = new atm("AC002");
            atm AC003 = new atm("AC003");
            atm AC004 = new atm("AC004");
            atm AC005 = new atm("AC005");
            atm AC006 = new atm("AC006");
            atm AC007 = new atm("AC007");
            atm AC008 = new atm("AC008");
            atm AC009 = new atm("AC009");
            atm AC0010 = new atm("AC0010");

            ID.add(AC001);
            ID.add(AC002);
            ID.add(AC003);
            ID.add(AC004);
            ID.add(AC005);
            ID.add(AC006);
            ID.add(AC007);
            ID.add(AC008);
            ID.add(AC009);
            ID.add(AC0010);

            System.out.print("Enter ID : ");
            String mid = sc.next();
            int flag = 0;
            int index = 0;
            for (int i = 0; i < 10; i++) {
                atm a = ID.get(i);

                if (mid.equals(a.getid())) {
                    flag++;
                    index = i;
                    break;
                }

            }

            if (flag == 1) {
                atm temp;
                temp = ID.get(index);
                System.out.println("----choose option from following manu----");
                System.out.println("1. Balance inquiry");
                System.out.println("2. Withdraw money [Maintain minimum balance 300₹]");
                System.out.println("3. Deposit money");
                System.out.println("4. Money Transfer");
                System.out.println("5. Create Account");
                System.out.println("6. Deactivate Account");
                System.out.println("7. Exit");
                System.out.println("8. ANOTHER account's Balance");

                for (int i = 1; i < 20; i++) {

                    System.out.print("->");
                    int option = sc.nextInt();
                    if (option == 7) {
                        break;
                    }

                    switch (option) {
                        case 1:
                            System.out.println("[1]Balance inquiry");
                            System.out.println("Your balance : " + temp.getbalance());
                            break;

                        case 2:
                            System.out.println("[2]Withdraw money");
                            System.out.print("Enter withdraw amount : ");
                            double wa = sc.nextDouble();
                            temp.withDrawl(wa);
                            break;
                        case 3:
                            System.out.println("[3]Deposit money");
                            System.out.print("Enter deposit amount : ");
                            double da = sc.nextDouble();
                            temp.deposit(da);
                            break;
                        case 4:
                            System.out.println("[4]Money Transfer");
                            System.out.print("Enter Destination account id for Money Transfer : ");
                            String tsid = sc.next();
                            atm tid = new atm("AC001");

                            for (int x = 0; x < 10; x++) {
                                atm temp1 = ID.get(x);
                                if (tsid.equals(temp1.getid())) {
                                    tid = ID.get(x);
                                    break;
                                }
                            }

                            System.out.print("Enter Transfer amount : ");
                            double ta = sc.nextDouble();
                            temp.moneytransfer(tid, ta);
                            ID.set(i, tid);

                            break;

                        case 5:
                            System.out.println("[5]Create Account");
                            System.out.print("Enter new unique account ID : ");
                            String newid = sc.next();
                            atm nid = new atm(newid);
                            ID.add(nid);
                            System.out.println("New Account Created successfully !!!");
                            break;
                        case 6:
                            System.out.println("[6]Deactivate Account");
                            System.out.print("Enter account ID for Deactivation : ");
                            String dsid = sc.next();
                            atm did = new atm("AC001");
                            int x;
                            for (x = 0; x < 10; x++) {
                                atm temp1 = ID.get(x);
                                if (dsid.equals(temp1.getid())) {
                                    did = ID.get(x);
                                    break;
                                }
                            }

                            ID.remove(x);
                            System.out.println("ID Deactivate successfully !!! ");
                            break;
                        case 8:
                            System.out.println("[8]ANOTHER account's Balance");
                            System.out.print("Enter Another account id : ");
                            String asid = sc.next();
                            atm aid = new atm("AC001");

                            for (int u = 0; u < 10; u++) {
                                atm temp1 = ID.get(u);
                                if (asid.equals(temp1.getid())) {
                                    aid = ID.get(u);
                                    System.out.println("Your balance : " + aid.getbalance());
                                    break;
                                }
                            }
                            break;

                    }
                    System.out.println("");
                }

            } else {
                System.out.println("ID IS NOT AVAILABLE !!!!");

            }


        }


}
