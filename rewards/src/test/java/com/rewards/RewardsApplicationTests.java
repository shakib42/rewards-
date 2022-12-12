package com.rewards;

import com.rewards.dto.Cart;
import com.rewards.service.RewardsCalculationService;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RewardsApplicationTests {

	@Autowired
	private RewardsCalculationService service;
	@Test
	void contextLoads() {
		Cart cart = new Cart();
		cart.setCartValue(110);
		Cart resp = service.calculateRewards(cart);
		Assertions.assertEquals(70, resp.getRewards());
	}

}
