
public class Accountmain_2_2 {
    public static void main(String[] args) {
        Account_2_2 a = new Account_2_2();

        a.setId(467);
        System.out.println(a.getId());
        a.setBalance(40000);
        System.out.println(a.getBalance());
        a.setAnnualInterestRate(0.07);
        System.out.println(a.getAnnualInterestRate());
        a.getMonthlyInterestRate();
        System.out.println(a.getMonthlyInterestRate());

    }

}
