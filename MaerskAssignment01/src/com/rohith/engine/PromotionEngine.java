package com.rohith.engine;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class PromotionEngine {
	
	 public double promotionCalculation(HashMap<String,Integer> cart ) {
		 
		 double totalamount = 0; 
		 Iterator<Entry<String, Integer>> itr = cart.entrySet().iterator();
		 
		 while(itr.hasNext()) {
			 Map.Entry<String, Integer> entry = itr.next();
			 String skuid = entry.getKey();
			 int quantity = entry.getValue();
			 
			 if(skuid.equals("A")) {				
				 totalamount = (quantity/3) * 130 + (quantity%3) * 50;		 		 
			 }
			 
		 }
		 
		 return totalamount;
	 }

}
