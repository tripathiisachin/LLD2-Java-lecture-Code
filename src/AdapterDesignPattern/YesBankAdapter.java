package AdapterDesignPattern;

public class YesBankAdapter implements BankAPI {

    private YesBank yesBank = new YesBank();

    @Override
    public double checkBalance() {
        return yesBank.getBalance();
    }

    @Override
    public boolean pay(int amount) {
        return yesBank.sendMoney(amount);
    }

}