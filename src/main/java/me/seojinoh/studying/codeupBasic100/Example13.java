package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example13 implements IExample {

	public void run() {
		int a, b;

		Scanner scanner = new Scanner(System.in, "UTF-8");

		a = scanner.nextInt();
		b = scanner.nextInt();

		System.out.println(a + " " + b);
	}

}
