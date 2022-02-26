package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example41 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		char input = scanner.next().toCharArray()[0];

		System.out.println((char) (input + 1));
	}

}
