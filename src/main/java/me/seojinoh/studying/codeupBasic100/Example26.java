package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example26 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		String[] inputs = scanner.next().split(":", 3);

		System.out.println(inputs[1]);
	}

}
