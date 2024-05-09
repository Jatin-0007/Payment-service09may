package dev.jatin.PaymentService9May.Service;

import org.springframework.stereotype.Service;

@Service
public interface PaymentService {

    String doPayment(String email,String phoneno,Long amount,String OrderId);
}
