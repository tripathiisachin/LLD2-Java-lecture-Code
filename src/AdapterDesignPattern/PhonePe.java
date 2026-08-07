package AdapterDesignPattern;

public class PhonePe {

    private BankAPI bank;

    // Dependency Injection
    public PhonePe(BankAPI bank) {
        this.bank = bank;
    }

    public void showFeatures() {

        System.out.println("Balance :: " + bank.checkBalance());

        bank.pay(9000);

    }

}
