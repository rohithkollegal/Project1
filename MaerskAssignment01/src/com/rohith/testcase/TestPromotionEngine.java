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
  
  @Test
  public void TestSkuidB() {
	  HashMap<String,Integer> cart = new HashMap<String,Integer>();
	  cart.put("B",5);
	  Assert.assertEquals(120.00,promotionEngine.promotionCalculation(cart)); 	 
	  cart.clear();
	  cart.put("B", 0);
	  Assert.assertEquals(0,promotionEngine.promotionCalculation(cart)); 
	  
	  //negatvie test case
	  cart.clear();
	  cart.put("B", 2);
	  Assert.assertNotEquals(60.00, cart);
  }
  
  @Test
  public void TestSkuidC() {
	  HashMap<String,Integer> cart = new HashMap<String,Integer>();
	 
	  cart.put("C",5);	  
	  Assert.assertEquals(100.00,promotionEngine.promotionCalculation(cart)); 
	  cart.clear();
	  cart.put("C", 0);
	  Assert.assertEquals(0,promotionEngine.promotionCalculation(cart)); 
  }
  
  @Test
  public void TestSkuidD() {
	  HashMap<String,Integer> cart = new HashMap<String,Integer>();
	 
	  cart.put("D",5);	  
	  System.err.println(promotionEngine.promotionCalculation(cart));
	  Assert.assertEquals(75.00,promotionEngine.promotionCalculation(cart)); 
	  cart.clear();
	  cart.put("D", 0);
	  Assert.assertEquals(0,promotionEngine.promotionCalculation(cart)); 
  }
}
