package AdapterDesignPattern;

public class YesBank {

    public int getBalance() {
        return 5000;
    }

    public boolean sendMoney(int amount) {
        System.out.println("Rupees :: " + amount + " Sent Successfully");
        return true;
    }

}
