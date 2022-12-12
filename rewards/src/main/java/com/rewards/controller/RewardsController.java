package com.rewards.controller;

import com.rewards.dto.Cart;
import com.rewards.service.RewardsCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rewards")
public class RewardsController {
    @Autowired
    private RewardsCalculationService rewardsCalculationService;

    @PostMapping("/get-rewards")
    public ResponseEntity<Cart> calculateRewards(@RequestBody Cart cart){
        Cart Response = rewardsCalculationService.calculateRewards(cart);
        return new ResponseEntity<>(Response, HttpStatus.OK);
    }
}
