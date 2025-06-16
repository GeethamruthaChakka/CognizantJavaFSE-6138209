package AdapterPatternExample;

public class TestAdapter {
    public static void main(String[] args) {
        PaymentProcessor stripePayment = new StripeAdapter(new StripeGateway());
        PaymentProcessor paypalPayment = new PayPalAdapter(new PayPalGateway());

        System.out.println("Processing Stripe Payment:");
        stripePayment.processPayment(250.00);

        System.out.println("Processing PayPal Payment:");
        paypalPayment.processPayment(500.00);
    }
}
