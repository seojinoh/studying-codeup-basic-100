package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example19 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		String[] inputs = scanner.next().split("\\.", 3);

		int y = Integer.parseInt(inputs[0]);
		int m = Integer.parseInt(inputs[1]);
		int d = Integer.parseInt(inputs[2]);

		System.out.println(String.format("%04d.%02d.%02d", y, m, d));
	}

}
