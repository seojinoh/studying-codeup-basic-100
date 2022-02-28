package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example63 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(a > b ? a : b);
	}

}
