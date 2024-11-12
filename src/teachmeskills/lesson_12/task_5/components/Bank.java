package teachmeskills.lesson_12.task_5.components;


public class Bank {

    private double initialAmount;
    private int years;
    private double interestRate;

    public Bank(double initialAmount, double interestRate, int years) {
        this.initialAmount = initialAmount;
        this.interestRate = interestRate;
        this.years = years;
    }

    public double calculateAmount() {
        return initialAmount * Math.pow((1 + interestRate), years);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Information about the contribution: \n ");
        sb.append(String.format("Initial amount: %.2f rubles'%n ", initialAmount));
        sb.append(String.format("Number of years: %d%n ", years));
        sb.append(String.format("Annual interest rate: %.2f%%%n ", interestRate * 100));
        return sb.toString();
    }
}