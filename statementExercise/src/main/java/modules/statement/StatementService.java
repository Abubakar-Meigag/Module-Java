package modules.statement;

import modules.interfacePackage.Statement;
import modules.interfacePackage.StatementSender;
import modules.sender.AllTransactionsMonthlyStatement;
import modules.sender.OutgoingTransactionsMonthlyStatement;

public class StatementService {

    private StatementDeliveryService delivery = new StatementDeliveryService();

    public void sendAllTransactionsStatement(StatementSender sender) {
        Statement statement = new AllTransactionsMonthlyStatement();
        delivery.deliverStatement(statement, sender);
    }

    public void sendOneTransactionStatement(StatementSender sender) {
        Statement statement = new OutgoingTransactionsMonthlyStatement();
        delivery.deliverStatement(statement, sender);
    }
}
