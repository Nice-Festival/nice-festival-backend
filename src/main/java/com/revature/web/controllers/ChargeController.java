package com.revature.web.controllers;

import com.revature.AppConfig;
import com.revature.models.Message;
import com.revature.models.Payment;
import com.revature.models.Status;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/buy")
public class ChargeController {

    @Value("${STRIPE.KEY}")
    public String API_KEY;

    @GetMapping(value = "/ticket", produces = MediaType.APPLICATION_JSON_VALUE)
    public void buyTicket() throws StripeException {
        Stripe.apiKey = API_KEY;

        Map<String, Object> params = new HashMap<>();
        params.put("amount", 5000);
        params.put("currency", "usd");
        params.put("source", "tok_mastercard");
        params.put(
                "description",
                "For a general admission ticket"
        );
        Charge charge = Charge.create(params);
    }
}
