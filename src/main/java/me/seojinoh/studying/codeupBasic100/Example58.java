package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example58 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println((a == 0) && (b == 0) ? 1 : 0);
	}

}