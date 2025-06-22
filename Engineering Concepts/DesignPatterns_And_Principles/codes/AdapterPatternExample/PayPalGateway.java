package AdapterPatternExample;

public class PayPalGateway {
    public void sendPayment(double amount) {
        System.out.println("PayPal: Payment of $" + amount + " completed.");
    }
}