package com.leetcode.examples;

import com.leetcode.examples.solutions.RemoveElement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamplesApplication.class, args);
		examples();
	}

	public static void examples() {
		System.out.println("Solutions: ");
		System.out.println("Solution 27: ");
		RemoveElement element = new RemoveElement();
		element.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
	}

}
