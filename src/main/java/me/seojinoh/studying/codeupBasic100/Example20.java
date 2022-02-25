package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example20 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		String[] inputs = scanner.next().split("-", 2);

		System.out.println(inputs[0] + inputs[1]);
	}

}
