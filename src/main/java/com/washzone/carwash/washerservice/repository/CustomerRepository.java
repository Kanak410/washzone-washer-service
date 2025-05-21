package com.washzone.carwash.washerservice.repository;

import com.washzone.carwash.bookingservice.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<CustomerModel, Long> {
    Optional<CustomerModel> findByUserId(Long id);
}
