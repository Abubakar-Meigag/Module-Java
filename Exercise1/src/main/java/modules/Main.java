package modules;


import modules.transactions.EmailStatementSender;
import modules.transactions.LetterStatementSender;
import modules.statement.StatementDeliveryService;
import modules.statement.StatementService;

public class Main {

    public static void main(String[] args) {
        StatementDeliveryService state = new StatementDeliveryService();
        StatementService service = new StatementService();

        state.deliverStatement("sent it by Beko", new LetterStatementSender());
        state.deliverStatement("emailed it by Beko", new EmailStatementSender());

        service.sendAllTransactionsStatement(new LetterStatementSender());
        service.sendAllTransactionsStatement(new EmailStatementSender());
        service.sendOutgoingTransactionsStatement(new LetterStatementSender());
        service.sendOutgoingTransactionsStatement(new EmailStatementSender());

    }
}