package modules.transactions;


import modules.interfacePackage.Statement;
import modules.interfacePackage.StatementSender;

public class EmailStatementSender implements StatementSender {

    @Override
    public void sendStatement(String statementContent) {
        System.out.println("Sending email form email statement: " + statementContent);
    }

    @Override
    public void sendStatement(Statement statement) {
        System.out.println("Sending email for account number: " + statement.getAccountNumber());
        System.out.println("Sending email for summary statement: " + statement.getSummary());
    }
}
