package com.washzone.carwash.washerservice.controller;

import com.washzone.carwash.washerservice.model.WasherModel;
import com.washzone.carwash.washerservice.repository.WasherRepository;
import com.washzone.carwash.washerservice.service.WasherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/wash")
public class WasherController {
    @Autowired
    private WasherRepository washerRepository;
    @Autowired
    private WasherService washerService;

    @GetMapping("/available")
    @PreAuthorize("hasRole('SERVICE')")
    public List<WasherModel> getAvailableWashers() {
            return washerService.getAllWashers();
    }

}
