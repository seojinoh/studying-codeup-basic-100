package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example35 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		String input = scanner.nextLine();

		System.out.printf("%o", Integer.valueOf(input, 16));
	}

}
