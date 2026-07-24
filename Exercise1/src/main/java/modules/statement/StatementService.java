package modules.statement;

import modules.interfacePackage.Statement;
import modules.interfacePackage.StatementSender;
import modules.transactions.AllTransactionsMonthlyStatement;
import modules.transactions.OutgoingTransactionsMonthlyStatement;

public class StatementService {
    private StatementDeliveryService deliveryService = new StatementDeliveryService();


    public void sendAllTransactionsStatement(StatementSender sender) {
        Statement statement = new AllTransactionsMonthlyStatement();
        deliveryService.deliverStatement(statement, sender);
    }

    public void sendOutgoingTransactionsStatement(StatementSender sender) {
        Statement statement = new OutgoingTransactionsMonthlyStatement();
        deliveryService.deliverStatement(statement, sender);
    }

}
