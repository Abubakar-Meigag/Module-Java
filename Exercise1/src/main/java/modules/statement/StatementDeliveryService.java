package modules.statement;

import modules.interfacePackage.Statement;
import modules.interfacePackage.StatementSender;

public class StatementDeliveryService {

    public void deliverStatement(String statementContent, StatementSender statementSender) {
        statementSender.sendStatement(statementContent);
    }

    public void deliverStatement(Statement statement, StatementSender statementSender) {
        statementSender.sendStatement(statement);
    }
}