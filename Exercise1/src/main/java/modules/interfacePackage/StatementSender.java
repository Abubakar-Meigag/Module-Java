package modules.interfacePackage;

/**
 * Interface for sending bank statements to customers.
 * Implementations define the delivery method (e.g. letter, email).
 */
public interface StatementSender {
    /**
     * Sends a statement to the customer.
     * @param statementContent the content of the statement to send
     */
    public void sendStatement(String statementContent);

    public void sendStatement(Statement statement);
}
