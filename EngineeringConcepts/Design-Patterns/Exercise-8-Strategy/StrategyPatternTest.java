public class StrategyPatternTest {

    public static void main(String[] args) {

        PaymentContext paymentContext =
                new PaymentContext(new CreditCardPayment("Shreshti Mittal"));

        paymentContext.executePayment(2500);

        paymentContext.setPaymentStrategy(
                new PayPalPayment("shreshti.mittal@example.com")
        );

        paymentContext.executePayment(1800);
    }
}