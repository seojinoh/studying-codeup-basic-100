package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example55 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println((a == 1) || (b == 1) ? 1 : 0);
	}

}
