package com.rohith.engine;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class PromotionEngine {
	
	 public double promotionCalculation(HashMap<String,Integer> cart ) {
		 
		 double totalamount = 0; 
		 Iterator<Entry<String, Integer>> itr = cart.entrySet().iterator();
		 long skuidCcount = 0;
		 long skuidDcount = 0;
		 
		 while(itr.hasNext()) {
			 Map.Entry<String, Integer> entry = itr.next();
			 String skuid = entry.getKey();
			 int quantity = entry.getValue();
			 
			 if(skuid.equals("A")) {				
				 totalamount = (quantity/3) * 130 + (quantity%3) * 50;		 		 
			 }
			 
			 if(skuid.equals("B")) {				
				 totalamount = (quantity/2) * 45 + (quantity%2) * 30;
			 }
			 
			 //since skuid C and D has to be calculated together, just collect the quantity of these two SKUIDs
			 if(skuid.equals("C")) {				
				 skuidCcount =quantity;
			 }
			 
			 if(skuid.equals("D")) {				
				 skuidDcount =quantity;
			 }
		 }
		 
		 if(skuidCcount == skuidDcount ) {
			 totalamount += skuidCcount * 30 ;
		 }
		 if(skuidCcount>skuidDcount) {
			 totalamount += skuidDcount* 30 + ((skuidCcount-skuidDcount) * 20);
		 }
		 if(skuidCcount<skuidDcount) {
			 totalamount += skuidCcount* 30 + ((skuidDcount-skuidCcount) * 15);
		 }
		 
		 System.out.println("C count :"+skuidCcount + " D count :"+skuidDcount);
		 return totalamount;
	 }

}
