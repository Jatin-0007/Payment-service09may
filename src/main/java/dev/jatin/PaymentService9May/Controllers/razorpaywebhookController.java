package dev.jatin.PaymentService9May.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rezorpayWebhook")
public class razorpaywebhookController {
@PostMapping("")
    public ResponseEntity acceptWebHookRequest(){
        return null;
    }
}
