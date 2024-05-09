package dev.jatin.PaymentService9May.Service;

import org.springframework.stereotype.Service;

@Service("stripe")
public class StripePaymentService implements PaymentService{
    @Override
    public String doPayment(String email, String phoneno, Long amount, String OrderId) {
        return null;
    }
}
