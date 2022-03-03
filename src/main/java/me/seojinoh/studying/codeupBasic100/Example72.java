package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example72 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int count = scanner.nextInt();

		int[] inputs = new int[count];

		for(int i = 0; i < count; i++) {
			inputs[i] = scanner.nextInt();
		}

		for(int input : inputs) {
			System.out.println(input);
		}
	}

}
