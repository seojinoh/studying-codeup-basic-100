package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example85 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		String[] inputs = scanner.nextLine().split("\\s", 4);

		int h = Integer.parseInt(inputs[0]);
		int b = Integer.parseInt(inputs[1]);
		int c = Integer.parseInt(inputs[2]);
		int s = Integer.parseInt(inputs[3]);

		float size = (float) (h * b * c * s);

		System.out.println(String.format("%.1f MB", size / 8 / 1024 / 1024));
	}

}
