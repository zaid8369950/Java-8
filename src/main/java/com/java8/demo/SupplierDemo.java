package com.java8.demo;

import java.util.Arrays;
import java.util.List;

public class SupplierDemo {

	public static void main(String[] args) {


		List<String> list1 = Arrays.asList();

		System.out.println(list1.stream().findAny().orElseGet(() -> "Hi JAVA 8 Demo"));
	}
	
	
}
