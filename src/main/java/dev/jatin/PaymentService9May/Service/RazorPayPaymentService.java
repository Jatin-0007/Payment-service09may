package dev.jatin.PaymentService9May.Service;

import com.razorpay.PaymentLink;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service("razorpay")
public class RazorPayPaymentService implements PaymentService {

    private RazorpayClient razorpayClient;
    public RazorPayPaymentService(RazorpayClient razorpayClient){
        this.razorpayClient = razorpayClient;
    }

    @Override
    public String doPayment(String email, String phoneno, Long amount, String OrderId)  {


        try{ JSONObject paymentLinkRequest = new JSONObject();
        paymentLinkRequest.put("amount",amount);
        paymentLinkRequest.put("currency","INR");
        paymentLinkRequest.put("receipt", OrderId);

        JSONObject customer = new JSONObject();
        customer.put("email",email);
        customer.put("phoneno",phoneno);
        paymentLinkRequest.put("customer",customer);

        JSONObject notify = new JSONObject();
        notify.put("sms",true);
        notify.put("email",true);
        paymentLinkRequest.put("notify",notify);

        paymentLinkRequest.put("callback_URL","https//xyz.com/rezorpayWebhook");
        paymentLinkRequest.put("callback_method","post");

            PaymentLink response = razorpayClient.paymentLink.create(paymentLinkRequest);
            return response.toString();
            } catch (Exception e) {
            e.printStackTrace();
        }
        return null;


    }
}
