package com.java8.demo;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {

	public static void main(String[] args) {
		/*
		 * Consumer<Integer> consumer = t -> System.out.println("Printing  : " + t);
		 * 
		 * consumer.accept(10);
		 */

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

		list1.stream().forEach(t -> System.out.println("print  : " + t));

	}
}
