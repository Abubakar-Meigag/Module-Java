package modules.sender;

import modules.interfacePackage.Statement;
import modules.interfacePackage.StatementSender;

public class LetterStatementSender implements StatementSender {

    @Override
    public void sendStatement(String statementContent) {
        System.out.println("Sending letter statement: " + statementContent);
    }

    @Override
    public void sendStatement(Statement statement) {
        System.out.println("Sending statement Account number is: " + statement.getAccountNumber());
        System.out.println("Sending statement in letter: " + statement.getSummary());
    }
}
