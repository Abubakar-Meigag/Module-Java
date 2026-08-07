package module;

import enums.ContractLength;
import interfaces.RentalCalculator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ThreeYearContractRentalGenerator implements RentalCalculator {


    @Override
    public List<Rental> generateRentals (Contract contract) {

        ContractLength length = contract.getContractLength();
        int months = length.getMonths();
        double capital = contract.getCarPrice() / months;
        double interest = (contract.getCarPrice() * length.getInterestRate()) / months;

        List<Rental> rentals = new ArrayList<>();
        LocalDate today = LocalDate.now();

        for (int i = 1; i <= months; i++) {
            LocalDate due = contract.getStartDate().plusMonths(i);
            boolean paid = !due.isAfter(today);
            rentals.add(new Rental(due, capital, interest, paid));
        }
        return rentals;
    }
}
