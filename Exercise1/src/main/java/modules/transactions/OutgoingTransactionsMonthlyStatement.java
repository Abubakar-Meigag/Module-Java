package modules.transactions;

import modules.interfacePackage.Statement;

public class OutgoingTransactionsMonthlyStatement implements Statement {

    @Override
    public String getAccountNumber() {
        return "A-002";
    }

    @Override
    public String getSummary() {
        return "Outgoing transactions only for this month";
    }
}
