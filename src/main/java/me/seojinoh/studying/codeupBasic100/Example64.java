package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example64 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		System.out.println((a < b ? a : b) < c ? (a < b ? a : b) : c);
	}

}
