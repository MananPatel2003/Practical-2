public class CheckingAccount extends Account {
    double overDraft = -1000;

    public CheckingAccount(int newId, double newBalance) {
        super(newId, newBalance);
    }

    public void checking(double i) {

        if (balance - i < overDraft){
            System.out.println("Failure: Can't overdraft more than Rs1,000”
                    + "A Rs 25 overdraft fee will be issued to your account. ");
            balance = balance - 25; }
        else
            balance = balance - i;
        }
}
