package com.java8.demo;

import java.util.function.Predicate;

public class PredicateDemo1 implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		 
		Predicate<Integer> predicate = new PredicateDemo1();
		
		System.out.println(predicate.test(88));
	}
	

}
