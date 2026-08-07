package enums;

public enum ContractLength {

    ONE_YEAR(12, 0.02),
    THREE_YEARS(36, 0.03);

    private final int months;
    private final double interestRate;

    ContractLength(int months, double interestRate) {
        this.months = months;
        this.interestRate = interestRate;
    }

    public int getMonths() {
        return months;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public static ContractLength fromYears(int years) {
        if (years == 1) return ONE_YEAR;
        if (years == 3) return THREE_YEARS;

        throw new IllegalArgumentException("Contract length must be 1 or 3 years, got: " + years);
    }


}
