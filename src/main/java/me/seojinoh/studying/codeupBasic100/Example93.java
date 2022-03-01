package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example93 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int count = scanner.nextInt();

		int[] numbers = new int[23];

		for(int i = 1; i < count + 1; i++) {
			numbers[scanner.nextInt() - 1]++;
		}

		String output = "";

		for(int number : numbers) {
			output += number + " ";
		}

		System.out.println(output);
	}

}
