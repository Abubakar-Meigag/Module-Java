package modules;

import modules.sender.EmailStatementSender;
import modules.sender.LetterStatementSender;
import modules.statement.StatementDeliveryService;
import modules.statement.StatementService;

public class Main {

    public static void main(String[] args) {
        StatementDeliveryService service = new StatementDeliveryService();
        StatementService statementService = new StatementService();

        service.deliverStatement("this is your bank statement", new EmailStatementSender());
        service.deliverStatement("this is your bank statement", new LetterStatementSender());

        statementService.sendAllTransactionsStatement(new EmailStatementSender());
        statementService.sendAllTransactionsStatement(new LetterStatementSender());
        statementService.sendOneTransactionStatement(new EmailStatementSender());
        statementService.sendOneTransactionStatement(new LetterStatementSender());

    }

}
