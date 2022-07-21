public class MortgageCalculator  {

    public final static byte MONTHS_IN_YEAR = 12;
    public final static byte PERCENT = 100;
    private int principal;
   private float anualInterst;
   private byte noOfYears;

    public MortgageCalculator(int principal, float anualInterst, byte noOfYears) {

        this.principal = principal;
        this.anualInterst = anualInterst;
        this.noOfYears = noOfYears;
    }

    public  double calculatemortgage(){

        float monthlyInterestRate = getMonthlyInterestRate();
        short noOfPayments = getNoOfPayments();

        double mortgage = principal
                   * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, noOfPayments))
                   / (Math.pow(1 + monthlyInterestRate, noOfPayments)) - 1;

           return mortgage;

       }

    public double calculateRemainingBalance(short noOfPaymentMade){

        float monthlyInterestRate = getMonthlyInterestRate();
        short noOfPayments = getNoOfPayments();
            double balance=principal*(Math.pow(1+monthlyInterestRate,noOfPayments)-Math.pow(1+monthlyInterestRate,noOfPaymentMade))
                    /
                    (Math.pow(1+monthlyInterestRate,noOfPayments)-1);
        return balance;
       }

    private short getNoOfPayments() {
        short noOfPayments = (short)(noOfYears * MONTHS_IN_YEAR);
        return noOfPayments;
    }

    public double[] getRemainingBalance() {
        double[] balance = new double[getNoOfPayments()];
        for (short Month = 1; Month <= balance.length; Month++)
             balance[Month] = calculateRemainingBalance(Month);
        return balance;
    }

    private float getMonthlyInterestRate() {
        float monthlyInterestRate= anualInterst / MONTHS_IN_YEAR / PERCENT;
        return monthlyInterestRate;
    }
}
