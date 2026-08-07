import module.Contract;
import service.RentalSummaryService;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Contract oneYearContract = new Contract("Jone", 44, LocalDate.of(2025, 8, 12), 1, 1000);
        Contract threeYearContract = new Contract("Jane Doe", 77, LocalDate.of(2024, 4, 1), 3, 50000);
        Contract completedContract = new Contract("Rosie Parker", 47, LocalDate.of(2021, 7, 10), 3, 40000);

        RentalSummaryService service = new RentalSummaryService();
        service.printRentalSummary(oneYearContract);

        try {
            Contract twoYearContract = new Contract("Michael Jones", 56, LocalDate.of(2025, 12, 12), 2, 2000);
            service.printRentalSummary(twoYearContract);
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating contract: " + e.getMessage());
        }

        service.printRentalSummary(threeYearContract);
        service.printRentalSummary(completedContract);




    }



}
