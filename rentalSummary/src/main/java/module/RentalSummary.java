package module;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class RentalSummary {

    private final String customerName;
    private final int customerAge;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final List<Rental> rentals;
    private final Optional<Rental> nextDueRental;
    private final double totalCapital;
    private final double totalInterest;
    private final long outstandingCount;

    public RentalSummary(String customerName, int customerAge, LocalDate startDate,
                         LocalDate endDate, List<Rental> rentals, Optional<Rental> nextDueRental,
                         double totalCapital, double totalInterest, long outstandingCount) {
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rentals = rentals;
        this.nextDueRental = nextDueRental;
        this.totalCapital = totalCapital;
        this.totalInterest = totalInterest;
        this.outstandingCount = outstandingCount;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("======\n");
        sb.append("Rental Summary: \n");
        sb.append("Customer: ").append(customerName).append(" (age ").append(customerAge).append(")\n");
        sb.append("Contract: " + startDate + " to " + endDate + "\n");
        sb.append("Rentals (sorted by due date):\n");

        for (Rental r : rentals){
            sb.append(String.format("  %s | capital: %.2f | interest: %.2f | %s%n",
                    r.getDueDate(), r.getCapitalAmount(), r.getInterestAmount(),
                    r.isPaid() ? "PAID" : "OUTSTANDING"));
        }

        if (nextDueRental.isPresent()) {
            sb.append("Next due rental: " + nextDueRental.get().getDueDate() + "\n");
        } else {
            sb.append("Next due rental: none\n");
        }

        sb.append(String.format("Total capital: %.2f%n", totalCapital));
        sb.append(String.format("Total interest: %.2f%n", totalInterest));
        sb.append("Outstanding rentals: " + outstandingCount + "\n");

        return sb.toString();
    }
}
