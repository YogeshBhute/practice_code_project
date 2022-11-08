package com.corejava.stringdemo;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

	List missingNum = new ArrayList();

	public List findMissingNumbers(int numb[], int diff) {

		int size = numb.length - 1;
		System.out.println(size);

		for (int i = size; i > 0; i--) {

			if (numb[i] - numb[i - 1] != diff) {
				missingNum.add(numb[i - 1] + diff);
				// break;
			}
		}
		return missingNum;

	}

	public static void main(String[] args) {

		MissingNumber missing = new MissingNumber();

		List listOfMissingNumbers = missing
				.findMissingNumbers(new int[] { 2, 6, 8, 10, 14, 18, 20, 24, 28, 32, 34, 36, 40 }, 2);

		System.out.println(listOfMissingNumbers);

	}
}
