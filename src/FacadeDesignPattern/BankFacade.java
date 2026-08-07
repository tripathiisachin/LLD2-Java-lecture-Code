package FacadeDesignPattern;

public class BankFacade {

    private AccountService accountService;
    private LoanService loanService;
    private FDService fdService;

    public BankFacade() {
        accountService = new AccountService();
        loanService = new LoanService();
        fdService = new FDService();
    }

    public void openNewCustomerAccount() {

        accountService.openAccount();

        loanService.getLoan();

        fdService.createFD();

        System.out.println("All Banking Services Completed Successfully");
    }
}