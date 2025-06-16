package StrategyPatternExample;

public class TestStrategy {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay with Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "Geethamrutha"));
        context.payAmount(2500.00);

        // Pay with PayPal
        context.setPaymentStrategy(new PayPalPayment("geetha@example.com"));
        context.payAmount(1800.00);
    }
}

