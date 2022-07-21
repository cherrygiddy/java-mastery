import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    private MortgageCalculator calculator;

    public  void printRemainingBalance() {
        System.out.println("Payment Scheduled");
        System.out.println("----------");
        for (double balance:calculator.getRemainingBalance()) {
            System.out.println("Balance" + currency.format(balance));
        }

    }

    public  void printMortgage() {
        double mortgage = calculator.calculatemortgage();
        String NumberFomarter= currency.format(mortgage);
        System.out.println();
        System.out.println("Mortgage");
        System.out.println("----------");
        System.out.println("Monthly Payment"+NumberFomarter);
    }
}
