package interfaces;

import module.Contract;
import module.Rental;

import java.util.List;

public interface RentalCalculator {

    List<Rental> generateRentals(Contract contract);


}
