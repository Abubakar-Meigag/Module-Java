package modules.sender;

import modules.interfacePackage.Statement;

public class AllTransactionsMonthlyStatement implements Statement{

    @Override
    public String getAccountNumber() {
        return "A-009";
    }

    @Override
    public String getSummary() {
        return "This is your ingoing and outgoing transactions statement for the current month";
    }
}
