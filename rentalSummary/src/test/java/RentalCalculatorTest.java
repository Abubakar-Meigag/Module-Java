import module.Contract;
import module.Rental;
import module.OneYearContractRentalGenerator;
import module.ThreeYearContractRentalGenerator;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RentalCalculatorTest {

    @Test
    void oneYearContractGenerates12Rentals() {
        Contract contract = new Contract("Test", 30, LocalDate.of(2025, 1, 1), 1, 12000);
        List<Rental> rentals = new OneYearContractRentalGenerator().generateRentals(contract);

        assertEquals(12, rentals.size());
    }

    @Test
    void oneYearCapitalAndInterestAreCorrect() {
        Contract contract = new Contract("Test", 30, LocalDate.of(2025, 1, 1), 1, 12000);
        List<Rental> rentals = new OneYearContractRentalGenerator().generateRentals(contract);


        assertEquals(1000.0, rentals.get(0).getCapitalAmount(), 0.001);
        assertEquals(20.0, rentals.get(0).getInterestAmount(), 0.001);
    }

    @Test
    void threeYearContractGenerates36Rentals() {
        Contract contract = new Contract("Test", 30, LocalDate.of(2025, 1, 1), 3, 36000);
        List<Rental> rentals = new ThreeYearContractRentalGenerator().generateRentals(contract);

        assertEquals(36, rentals.size());
    }

    @Test
    void threeYearCapitalAndInterestAreCorrect() {
        Contract contract = new Contract("Test", 30, LocalDate.of(2025, 1, 1), 3, 36000);
        List<Rental> rentals = new ThreeYearContractRentalGenerator().generateRentals(contract);

        assertEquals(1000.0, rentals.get(0).getCapitalAmount(), 0.001);
        assertEquals(30.0, rentals.get(0).getInterestAmount(), 0.001);
    }

    @Test
    void invalidContractLengthThrows() {
        assertThrows(IllegalArgumentException.class,
                () -> new Contract("Test", 30, LocalDate.of(2025, 1, 1), 2, 20000));
    }
}
