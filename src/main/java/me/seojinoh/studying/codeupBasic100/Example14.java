package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example14 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		char x = scanner.next().charAt(0);
		char y = scanner.next().charAt(0);

		System.out.println(y + " " + x);
	}

}
