package AdapterDesignPattern;

public class AdapterDemo {

    public static void main(String[] args) {

        BankAPI bank = new YesBankAdapter(); 
        // BankAPI bank = new HDFCBankAdapter();

        PhonePe phonePe = new PhonePe(bank);

        phonePe.showFeatures();

    }

}