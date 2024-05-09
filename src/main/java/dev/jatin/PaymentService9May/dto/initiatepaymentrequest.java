package dev.jatin.PaymentService9May.dto;

import lombok.Getter;
import lombok.Setter;

@Getter

@Setter
public class initiatepaymentrequest {
    private String email;
    private String phoneno;
    private Long amount;
    private String OrderId;
}
