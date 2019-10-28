public class ex72b {
    public static void main(String[] args) {

        Account mattsAccount = new Account("Matt's account",1000);
        Account myAccount = new Account("My account", 0);

        System.out.println("Initial state");
        System.out.println(mattsAccount);
        System.out.println(myAccount);


        System.out.println();
        System.out.println("Withdraw 100 from Matt's account");
        mattsAccount.withdrawal(100);
        System.out.println("Deposit 100 to My account");
        myAccount.deposit(100);


        System.out.println();
        System.out.println("Final state");
        System.out.println(mattsAccount);
        System.out.println(myAccount);

    }
}
