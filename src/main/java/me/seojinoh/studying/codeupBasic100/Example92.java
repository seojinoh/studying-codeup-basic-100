package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example92 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		String[] inputs = scanner.nextLine().split("\\s", 3);

		int a = Integer.parseInt(inputs[0]);
		int b = Integer.parseInt(inputs[1]);
		int c = Integer.parseInt(inputs[2]);

		int day = 1;

		while(day % a != 0 || day % b != 0 || day % c != 0) {
			day++;
		}

		System.out.println(day);
	}

}
