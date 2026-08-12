package ObserverDesignPattern;

public class Main {

    public static void main(String[] args) {

        Amazon amazon = new Amazon();

        InvoiceGenerator invoice = new InvoiceGenerator();
        WMS wms = new WMS();
        IMS ims = new IMS();
        EmailService email = new EmailService();

        amazon.register(invoice);
        amazon.register(wms);
        amazon.register(ims);
        amazon.register(email);

        amazon.orderPlaced();
    }
}