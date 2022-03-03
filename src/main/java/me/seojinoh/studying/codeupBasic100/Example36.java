package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example36 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		char input = scanner.next().charAt(0);

		System.out.println((int) input);
	}

}
