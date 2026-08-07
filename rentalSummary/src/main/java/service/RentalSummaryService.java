package service;

import enums.ContractLength;
import interfaces.RentalCalculator;
import module.*;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class RentalSummaryService {

    private RentalCalculator calculatorFor (Contract contract) {

        if (contract.getContractLength() == ContractLength.ONE_YEAR) {
            return new OneYearContractRentalGenerator();
        }

        return new ThreeYearContractRentalGenerator();
    }

    private Optional<RentalSummary> generateRentalSummary (Contract contract){

        List<Rental> rentals = calculatorFor(contract).generateRentals(contract);
        rentals.sort(Comparator.comparing(Rental::getDueDate));

        LocalDate today = LocalDate.now();
        LocalDate finalDue = rentals.get(rentals.size() - 1).getDueDate();

        if (today.isAfter(finalDue)) {
            return Optional.empty();
        }

        Optional<Rental> nextDue = rentals.stream()
                .filter(r -> !r.isPaid())
                .min(Comparator.comparing(Rental::getDueDate));

        double totalCapital = rentals.stream().mapToDouble(Rental::getCapitalAmount).sum();
        double totalInterest = rentals.stream().mapToDouble(Rental::getInterestAmount).sum();
        long outstanding = rentals.stream().filter(r -> !r.isPaid()).count();


        return Optional.of(new RentalSummary(
                contract.getCustomerName(), contract.getCustomerAge(),
                contract.getStartDate(), contract.getEndDate(),
                rentals, nextDue, totalCapital, totalInterest, outstanding
        ));
    }


    public void printRentalSummary (Contract contract){
        Optional<RentalSummary> summary = generateRentalSummary(contract);

        if (summary.isPresent()) {
            System.out.println(summary.get());
        }else {
            System.out.println("Contract for: " + contract.getCustomerName() + " is complete.");
        }
    }


}
