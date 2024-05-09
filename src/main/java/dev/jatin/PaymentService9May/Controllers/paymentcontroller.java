package dev.jatin.PaymentService9May.Controllers;

import dev.jatin.PaymentService9May.Service.PaymentService;
import dev.jatin.PaymentService9May.Service.RazorPayPaymentService;
import dev.jatin.PaymentService9May.Service.StripePaymentService;
import dev.jatin.PaymentService9May.dto.initiatepaymentrequest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class paymentcontroller {

    private PaymentService razorPayPaymentService;
    private PaymentService stripePaymentService;

    public paymentcontroller(@Qualifier("razorpay")PaymentService razorpaypaymentService,
                             @Qualifier("stripe")PaymentService stripepaymentService){
        this.razorPayPaymentService = razorpaypaymentService;
        this.stripePaymentService = stripepaymentService;

    }
 @PostMapping("/payment")
    public String initiatepayment(@RequestBody initiatepaymentrequest requestdto){
        return null;
    }
}
