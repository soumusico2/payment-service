package com.hebertnunes.payment_service.repositories;

import com.hebertnunes.payment_service.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findTop20ByCustomerIdOrderByCreatedAtDesc(String customerId);
}
