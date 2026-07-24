package modules.sender;

import modules.interfacePackage.Statement;

public class OutgoingTransactionsMonthlyStatement implements Statement {

    @Override
    public String getSummary() {
        return "This is your outgoing transactions statement for the month";
    }

    @Override
    public String getAccountNumber() {
        return "B-009";
    }
}
