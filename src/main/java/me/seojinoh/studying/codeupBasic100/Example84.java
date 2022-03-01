package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example84 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		String[] inputs = scanner.nextLine().split("\\s", 3);

		int r = Integer.parseInt(inputs[0]);
		int g = Integer.parseInt(inputs[1]);
		int b = Integer.parseInt(inputs[2]);

		int count = 0;

		for(int i = 0; i < r; i++) {
			for(int j = 0; j < g; j++) {
				for(int k = 0; k < b; k++) {
					System.out.println(i + " " + j + " " + k);

					count++;
				}
			}
		}

		System.out.println(count);
	}

}
