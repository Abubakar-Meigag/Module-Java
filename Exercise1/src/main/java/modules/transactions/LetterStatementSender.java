package modules.transactions;


import modules.interfacePackage.Statement;
import modules.interfacePackage.StatementSender;

public class LetterStatementSender implements StatementSender {

    /**
     *
     * @param statementContent the content of the statement to send
     */
    @Override
    public void sendStatement(String statementContent) {
        System.out.println("Sending statement: " + statementContent);
    }

    @Override
    public void sendStatement(Statement statement) {
        System.out.println("Sending statement summary as letter: " + statement.getSummary());
    }

}