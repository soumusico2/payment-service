package com.hebertnunes.payment_service.services;

import com.hebertnunes.payment_service.dtos.PaymentResponse;
import com.hebertnunes.payment_service.entities.Payment;
import com.hebertnunes.payment_service.repositories.PaymentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentRepository repo;

    public PaymentService(PaymentRepository repo) {
        this.repo = repo;
    }

    @Transactional
    public Payment create(PaymentResponse response) {

        return null;
    }

}
