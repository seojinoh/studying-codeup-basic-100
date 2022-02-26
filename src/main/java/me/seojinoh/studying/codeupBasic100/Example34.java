package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example34 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		String input = scanner.nextLine();

		System.out.printf("%d", Integer.valueOf(input, 8));
	}

}
