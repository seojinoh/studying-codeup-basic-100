package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example18 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		String[] inputs;
		String h, m;

		inputs = scanner.next().split(":", 2);

		h = inputs[0];
		m = inputs[1];

		System.out.println(h + ":" + m);
	}

}
