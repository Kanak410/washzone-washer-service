package com.washzone.carwash.washerservice.repository;

import com.washzone.carwash.washerservice.model.BookingModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<BookingModel,Long> {
    List<BookingModel> findAllByCustomerEmail(String email);
}
