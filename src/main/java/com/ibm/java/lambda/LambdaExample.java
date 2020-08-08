package com.ibm.java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List cards = Arrays.asList("Visa", "MasterCard", "American Express", "Visa"); 
		System.out.println("list: " + cards); 
		
		/*
		 * Map cards2Length =
		 * cards.stream().collect(Collectors.toMap(Function.identity(), String::length,
		 * (e1, e2) -> e1));
		 */
		
		Map<?> cards2Length = cards.stream().collect(Collectors.toMap(Function.identity(), 
				String::length,(e1, e2) -> e1));
		
		
		System.out.println("map: " + cards2Length);
		

		

	}

}
