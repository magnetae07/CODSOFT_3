import java.util.*;
public class ATM_Interface{
    static double balance=1000000;
    static double newbalance=balance;
    public static void checkBalance (double balance){
                System.out.println("The Avaliable Balance: "+newbalance);
                System.out.println();

            }
            public static double withdraw(double balance, double withdraw){
               
                System.out.println("The withdrawing amount is:"+withdraw);
                if(balance>= withdraw){
                    balance=newbalance-withdraw;
                    System.out.println("Kindly collect your cash and remove the card!");
                     newbalance=balance;
                 checkBalance(balance);
                
                }
                else{
                    System.out.println("Sorry! The balance is insufficient!");
                    System.out.println();
                    //return balance;
                }
                    return balance;
            }
            public static double deposit(double balance, double deposit){
                System.out.println("The depositing amount is:"+deposit);
                
               balance=newbalance+deposit;
                System.out.println("The amount is successfully deposited!");
                 newbalance=balance;
                checkBalance(balance);
                return balance;
            }
            
    public static void main(String[] args)
    {
            double withdraw,deposit;
            int ATMPin=6789;
            try (Scanner sc = new Scanner(System.in)) {
                while(true){
                    System.out.println("Welcome to ATM!");
                    System.out.println("Choose 1 to Withdraw the amount.");
                    System.out.println("Choose 2 to Deposit the amount.");
                    System.out.println("Choose 3 to Check your Balance amount.");
                    System.out.println("Choose 4 to EXIT.");
                    System.out.println("Choose an option to perform the respective operation: ");
                    int ch= sc.nextInt();
                    switch (ch) {
                        case 1:
                        System.out.println("Enter ATM Pin:");
                        int pin=sc.nextInt();
                        if(ATMPin==pin){
                             System.out.println("Enter the amount to be withdrawn:");
                            withdraw=sc.nextInt();
                            withdraw(balance,withdraw);
                        }
                        else
                        System.out.println("Incorrect ATM Pin entered!");
                            break;
                        case 2: 
                        System.out.println("Enter ATM Pin:");
                        pin=sc.nextInt();
                        if(ATMPin==pin){
                        System.out.println("Enter the amount to be deposited:");
                            deposit=sc.nextInt();
                            deposit(balance,deposit);
                        }
                        else
                        System.out.println("Incorrect ATM Pin entered!");
                            break;
                        case 3:
                        System.out.println("Enter ATM Pin:");
                         pin=sc.nextInt();
                         if(ATMPin==pin)
                         {
                       checkBalance(balance);
                        System.out.println(" ");
                         }
                         else
                        System.out.println("Incorrect ATM Pin entered!");
                        break;
                        case 4: 
                        System.out.println("Thank You, Have a Nice Day!");
                        System.exit(0);
                     
                    }
                    }
            }
               
            }
        
        }