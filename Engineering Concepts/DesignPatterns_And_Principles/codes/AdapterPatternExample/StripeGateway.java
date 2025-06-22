package AdapterPatternExample;

public class StripeGateway {
    public void makeStripePayment(double amount) {
        System.out.println("Stripe: Paid $" + amount);
    }
}
