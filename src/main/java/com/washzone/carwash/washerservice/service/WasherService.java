package com.washzone.carwash.washerservice.service;


import com.washzone.carwash.washerservice.model.WasherModel;
import com.washzone.carwash.washerservice.repository.WasherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WasherService {
    @Autowired
    private WasherRepository washerRepository;

    public List<WasherModel> getAllWashers() {
        return washerRepository.findAll()
                .stream()
                .filter(WasherModel ::isAvailable)
                .collect(Collectors.toList());



    }


}
