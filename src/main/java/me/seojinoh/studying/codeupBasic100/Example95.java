package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example95 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int count = scanner.nextInt();

		int[] numbers = new int[count];

		for(int i = 0; i < count; i++) {
			numbers[i] = scanner.nextInt();
		}

		int output = numbers[0];

		for(int i = 1; i < count; i++) {
			output = output > numbers[i] ? numbers[i] : output;
		}

		System.out.println(output);
	}

}
