package com.guideme.core;

public class FindMaxTwoNumber {

	public static void main(String[] args) {
		int num[] = { 5, 34, 78, 2, 45, 1, 99, 23 };
		int maxOne = 0;
		int maxTwo = 0;
		for (int n : num) {
			System.out.println("Current Occurance :" + n + " : maxone :" + maxOne + "/ and minone :" + maxTwo);
			if (maxOne < n) {
				maxTwo = maxOne;
				maxOne = n;
			} else if (maxTwo < n) {
				maxTwo = n;
			}
		}
		System.out.println("First Max Number: " + maxOne);
		System.out.println("Second Max Number: " + maxTwo);
	}

}
