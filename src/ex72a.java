public class ex72a {
    public static void main(String[] args) {

        Account bartosAccount = new Account("Barto's account",100.00);


        System.out.println("Initial state");
        System.out.println(bartosAccount);



        System.out.println("Deposit 20");
        bartosAccount.deposit(20);



        System.out.println("Final state");
        System.out.println(bartosAccount);

    }
}
