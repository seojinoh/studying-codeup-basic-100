package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example94 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int count = scanner.nextInt();

		int[] numbers = new int[count];

		for(int i = 0; i < count; i++) {
			numbers[i] = scanner.nextInt();
		}

		String output = "";

		for(int i = count - 1; i > -1; i--) {
			output += numbers[i] + " ";
		}

		System.out.println(output);
	}

}
