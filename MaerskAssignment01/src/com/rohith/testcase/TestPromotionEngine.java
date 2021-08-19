package com.rohith.testcase;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rohith.engine.PromotionEngine;

public class TestPromotionEngine {
	
	PromotionEngine promotionEngine = new PromotionEngine();
	
  @Test
  public void TestSkuidA() {
	  HashMap<String,Integer> cart = new HashMap<String,Integer>();
	  cart.put("A",5);
	  Assert.assertEquals(230.00,promotionEngine.promotionCalculation(cart)); 	  
  }
}
