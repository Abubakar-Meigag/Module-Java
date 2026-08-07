package module;

import enums.ContractLength;

import java.time.LocalDate;

public class Contract {

    private final String customerName;
    private final int customerAge;
    private final LocalDate startDate;
    private final double carPrice;
    private final ContractLength contractLength;

    public Contract(String customerName, int customerAge, LocalDate startDate,
             int contractLengthYears, double carPrice) {
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.startDate = startDate;
        this.carPrice = carPrice;
        this.contractLength = ContractLength.fromYears(contractLengthYears);
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public ContractLength getContractLength() {
        return contractLength;
    }

    public LocalDate getEndDate() {
        return startDate.plusMonths(contractLength.getMonths());
    }

}
