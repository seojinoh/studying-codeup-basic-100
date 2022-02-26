package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example39 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		long a = scanner.nextLong();
		long b = scanner.nextLong();

		System.out.println(a + b);
	}

}
