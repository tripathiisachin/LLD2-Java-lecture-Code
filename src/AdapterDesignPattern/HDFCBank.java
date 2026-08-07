package AdapterDesignPattern;

public class HDFCBank {

    public double balance() {
        return 10000;
    }

    public boolean transfer(int amount) {
        System.out.println("Rupees :: " + amount + " Transferred Successfully");
        return true;
    }

}