import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        float num = 0;
        Bank test = new Bank("Testing Bank");
        System.out.println(test.getBankName());

        do {
            System.out.println("1. Make New Account");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Check Balance");
            System.out.println("5. Quit");

            System.out.println("ENTER YOUR CHOICE");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                String first = "";
                String last = "";
                System.out.println("Customer first name");
                first=sc.next();
                System.out.println("Customer last name");
                last=sc.next();
                test.addCustomer(first, last);
                test.getCustomer(0).setAccount(new Account(0));
                System.out.println(first + " " + last +" you have successfully created a new account.");
                break;

                case 2:
                System.out.println("How much money is withdrawn: ");
                num=sc.nextFloat();
                if(test.getCustomer(0).getAccount().withdraw(num)){
                    System.out.println("Leftover balance: ");
                    System.out.print(test.getCustomer(0).getAccount().getBalance());
                    System.out.println();

                } else {
                    System.out.print("Not enough funds");
                }
                break;
                
                case 3:
                if (test.getCustomer(0).getAccount().deposit(num)) {
                    System.out.println("Your balance is: ");

                } else {
                    System.out.print("Not enough funds");
                }
                break;
            }
        } while (choice != 5);
    }
}
    
