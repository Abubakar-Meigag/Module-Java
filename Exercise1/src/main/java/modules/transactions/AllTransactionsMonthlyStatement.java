package modules.transactions;

import modules.interfacePackage.Statement;

public class AllTransactionsMonthlyStatement implements Statement {

   @Override
    public String getAccountNumber() {
       return "A-001";
   }

   @Override
    public String getSummary() {
       return "all transactions ingoing and outgoing for this month";
   }


}
