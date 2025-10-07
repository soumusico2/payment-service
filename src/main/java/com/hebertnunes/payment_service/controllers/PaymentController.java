package com.hebertnunes.payment_service.controllers;

import com.hebertnunes.payment_service.services.PaymentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public ResponseEntity create(@Valid @RequestBody RequestEntity req) {

        var saved = paymentService.create(req);
    }
}
