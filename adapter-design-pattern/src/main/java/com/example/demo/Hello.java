package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hello {
	public static void main(String[] args) {
		List<String> input = new ArrayList<>();

		input.add("Hello");
		Collections.reverse(input);
		System.out.println(input);
	}

}
