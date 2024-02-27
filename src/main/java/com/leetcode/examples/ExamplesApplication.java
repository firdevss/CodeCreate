package com.leetcode.examples;

import com.leetcode.examples.solutions.RemoveElement;
import com.leetcode.examples.solutions.SearchInsert;
import org.springframework.beans.factory.annotation.Autowired;
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
		RemoveElement removeElement = new RemoveElement();
		System.out.println("removeElement - Solution 27: " + removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
		SearchInsert searchInsert = new SearchInsert();
		System.out.println("searchInsert - Solution 35: " + searchInsert.searchInsert(new int[]{1,3,5,6}, 5));
	}

}
