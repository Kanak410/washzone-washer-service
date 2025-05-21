package com.washzone.carwash.washerservice.repository;

import com.washzone.carwash.washerservice.model.WasherModel;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.Optional;

public interface WasherRepository extends JpaRepository<WasherModel, Long> {
   @Query("SELECT c FROM WasherModel c WHERE c.id= :Id")
    Optional<WasherModel> findById(@Param Long Id);

   @Query("SELECT w from WasherModel w where w.email =:email")
    Optional<WasherModel> findByEmail(@Param("email") String email);
}
