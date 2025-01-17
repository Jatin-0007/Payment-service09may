package dev.jatin.PaymentService9May.configuration;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorPayConfig {
    @Value("${razorpay.key.id}")
    private String RazorpayKeyId;
    @Value("${razorpay.key.secret}")
    private String RazorpayKeySecret;
  @Bean
    public RazorpayClient createRazorpayClient() throws RazorpayException {
        return new RazorpayClient(RazorpayKeyId,RazorpayKeySecret);
    }

}
