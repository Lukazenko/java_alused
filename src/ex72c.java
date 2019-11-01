public class ex72c {
    public static void main(String[] args) {

        Account aAccount = new Account("A account",100.0);
        Account bAccount = new Account("B account", 0.0);
        Account cAccount = new Account("C account", 0.0);

        System.out.println("Initial state");
        System.out.println(aAccount);
        System.out.println(bAccount);
        System.out.println(cAccount);



        System.out.println();
        System.out.println("Transfers 50.0 from account A to account B");
        transfer(aAccount, bAccount, 50.0);
        System.out.println("Transfers 25.0 from account B to account C");
        transfer(bAccount, cAccount, 25.0);


        System.out.println();
        System.out.println("Final state");
        System.out.println(aAccount);
        System.out.println(bAccount);
        System.out.println(cAccount);

    }

    private static void transfer(Account from, Account to, double howMuch){

        from.withdrawal(howMuch);
        to.deposit(howMuch);


    }
}
