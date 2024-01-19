package com.malev.web.controller;

import com.malev.api.DTO.PayRequest;
import com.malev.api.DTO.PayResponse;
import com.malev.api.PayApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController implements PayApi {

    @Override
    @PostMapping("/pay")
    public PayResponse pay(@RequestBody PayRequest payRequest) {
        return new PayResponse("Successful payment", "GOOD");
    }

    @PostMapping("/revert")
    public PayResponse revert(@RequestBody PayRequest payRequest) {
        return new PayResponse("Successfully reverted payment", "GOOD");
    }
}
