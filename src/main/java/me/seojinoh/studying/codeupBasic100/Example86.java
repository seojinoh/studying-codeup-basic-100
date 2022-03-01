package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example86 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		String[] inputs = scanner.nextLine().split("\\s", 3);

		int w = Integer.parseInt(inputs[0]);
		int h = Integer.parseInt(inputs[1]);
		int b = Integer.parseInt(inputs[2]);

		float size = (float) (w * h * b);

		System.out.println(String.format("%.2f MB", size / 8 / 1024 / 1024));
	}

}
