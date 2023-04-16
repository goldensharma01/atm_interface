import java.util.Scanner;

public class atm_interface {
    public static void main(String[] args) {
        int Balance=10000;
        int Whithdraw=0;
        int Deposite=0;
        int Transfer=0;
        Scanner sc=new Scanner(System.in);
        int pin=2233;
        System.out.println("Enter pin");

        int n;
        int enter=sc.nextInt();
        if(pin==enter) {
            while (true) {
                System.out.println("------WELCOME TO ATM----");
                System.out.println("Enter 1 For Transaction History");
                System.out.println("Enter 2 For Whithdraw Money");
                System.out.println("Enter 3 For Deposite Money");
                System.out.println("Enter 4 for Transfer");
                System.out.println("Enter 5 for exit");
                System.out.println("Enter option: ");
                n=sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("Transaction History ");
                        System.out.println("Money Whithdraw -"+Whithdraw);
                        System.out.println("Money Deposite -"+Deposite);
                        System.out.println("Money Transfer-"+Transfer);
                        System.out.println("The Current Balance is-"+ Balance);
                        System.out.println();

                        break;
                    case 2:
                        System.out.println("Enter A Whithdraw Ammount");
                        Whithdraw=sc.nextInt();
                        if(Whithdraw>Balance) {
                            System.out.println("Insufficient Balance!");
                            System.out.println("Unable to Withdraw");

                        }
                        else {
                            Balance=Balance-Whithdraw;
                            System.out.println("The Whithdraw Money is-"+Whithdraw);
                            System.out.println("Collect Your Money");
                            System.out.println();

                        }
                        break;
                    case 3:
                        System.out.println("Enter A Deposite Ammount");
                        Deposite =sc.nextInt();
                        Balance=Deposite+Balance;
                        System.out.println("Place Your Mney Is Carefully ");

                        System.out.println("Money is Succesfully Deposite ");
                        System.out.println("");
                        break;
                    case 4:
                        while(true) {
                            System.out.println("Enter The Account No Of Beneficiary");
                            int accono= sc.nextInt();
                            System.out.println("Enter The  IFSC Code Of Benificiary ");
                            int ifsc= sc.nextInt();
                            System.out.println("Enter Account No");
                            System.out.println("confirm Account Number \n1.Confirm \n2.No");
                            int choice = sc.nextInt();
                            if(choice==1) {
                                System.out.println("Enter Ammount");
                                Balance=Balance-Transfer;
                                System.out.println("Ammount Succfully Transfer ");
                                break;
                            }
                            else {
                                System.out.println("Invalid Account No");

                            }
                        }
                        break ;
                    case 5:
                        System.out.println("Thank You For Using Our ATM");
                        System.exit(0);
                    default:
                        System.out.println("Invalid Option");

                }
            }

        }

        else {
            System.out.println("Invalid pin");
        }

    }
}
