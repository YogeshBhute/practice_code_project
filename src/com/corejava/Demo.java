package com.corejava;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {

		int[] arr = { 5, 32, 1, 7, 10, 50, 19, 21, 2 };

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		int n = arr.length;

		for (int i = n; i > 0; i--) {

			for (int j = n - 1; j > 0; j--) {

				for (int k = n - 2; k > 0; k--) {

					if (arr[i] == (arr[k] + arr[j])) {

						System.out.println("Numbers are:" + arr[i] + " " + arr[j] + " " + arr[k]);

					} else if (arr[j] == (arr[k] + arr[i])) {

						System.out.println("Numbers are:" + arr[i] + " " + arr[j] + " " + arr[k]);

					} else if (arr[k] == (arr[i] + arr[j])) {

						System.out.println("Numbers are:" + arr[i] + " " + arr[j] + " " + arr[k]);

					} else {

						System.out.println("No Such numbers");
					}
				}

			}

		}

	}
}
