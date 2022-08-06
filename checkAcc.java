public class checkAcc {

    public static void main(String[] args) {
        SavingAccount savings = new SavingAccount(5, 1500);
        CheckingAccount checking = new CheckingAccount(4, 1500);
        Account account = new Account();
        savings.withdraw(2000);
        checking.checking(3000);
        System.out.println(savings.getBalance());
        System.out.println(checking.getBalance());

    }

    public static void Print(double x) {
        System.out.println("The current balance is " + " Rs " + x);
    }
}
