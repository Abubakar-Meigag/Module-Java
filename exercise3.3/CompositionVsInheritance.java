
class PaymentMethod {
    void pay(double anount){
        System.out.println("Paying " + anount);
    }

    void pay(double amount, String currency){
        System.out.println("Paying " + amount + " " + currency);
    }
}

class CreditCard extends PaymentMethod{

    @Override
    void pay(double amount) {
        System.out.println("Paying " + amount + " by credit card");
    }
}

class Checkout {
    private PaymentMethod paymentMethod;

    Checkout(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    void processPayment(double amount) {
        paymentMethod.pay(amount);
    }

    void updatePaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

}

class CompositionVsInheritance {

    public static void main(String[] args) {
        PaymentMethod method = new PaymentMethod();
        Checkout checkout = new Checkout(method);
        checkout.processPayment(123.33);

        checkout.updatePaymentMethod(new CreditCard());
        checkout.processPayment(250.00);

    }

}