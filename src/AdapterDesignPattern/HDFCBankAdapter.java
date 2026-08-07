package AdapterDesignPattern;

public class HDFCBankAdapter implements BankAPI {

    private HDFCBank hdfc = new HDFCBank();

    @Override
    public double checkBalance() {
        return hdfc.balance();
    }

    @Override
    public boolean pay(int amount) {
        return hdfc.transfer(amount);
    }

}
