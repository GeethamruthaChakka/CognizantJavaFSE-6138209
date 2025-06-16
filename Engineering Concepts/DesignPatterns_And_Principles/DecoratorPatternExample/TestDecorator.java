package DecoratorPatternExample;

public class TestDecorator {
    public static void main(String[] args) {
        // Step 1: Base notifier
        Notifier notifier = new EmailNotifier();

        // Step 2: Add SMS
        notifier = new SMSNotifierDecorator(notifier);

        // Step 3: Add Slack
        notifier = new SlackNotifierDecorator(notifier);

        // Step 4: Send notification
        notifier.send("Your order has been shipped!");
    }
}
