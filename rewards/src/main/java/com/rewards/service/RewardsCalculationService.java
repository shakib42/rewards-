package com.rewards.service;

import com.rewards.dto.Cart;
import org.springframework.stereotype.Service;


@Service
public class RewardsCalculationService {
    public Cart calculateRewards(Cart cart) {
        if(cart != null){
            int rewardPoints = 0;
            double cartValue = cart.getCartValue();
            if(cartValue >= 50){
                if(cartValue<=100){
                    rewardPoints = Double.valueOf(cartValue - 50).intValue();
                }
                if(cartValue > 100){
                    rewardPoints+= ((cartValue - 100) * 2);
                    rewardPoints+=50;
                }

            }
            cart.setRewards(rewardPoints);
        }
        return cart;
    }
}
