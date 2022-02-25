package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example11 implements IExample {

	public void run() {
		char c;

		Scanner scanner = new Scanner(System.in, "UTF-8");

		c = scanner.next().charAt(0);

		System.out.println(c);
	}

}
