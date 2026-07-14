
class PoymentMethod {
    void pay(double anount){
        System.out.println("Paying " + anount);
    }

    void pay(double amount, String currency){
        System.out.println("Paying " + amount + " " + currency);
    }
}

class DirectDebit extends PoymentMethod {

    /**
     * @param anount
     */
    @Override
    void pay(double anount) {
        System.out.println("Paying " + anount + " via Direct Debit");
    }
}

class OverloadingvsOverriding {

    public static void main(String[] args) {
        PoymentMethod pm = new PoymentMethod();
        DirectDebit dd = new DirectDebit();

        pm.pay(399.99);
        pm.pay(12.99, "£");

        dd.pay(10000);
        dd.pay(10000, "USD");
    }
}

