package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example12 implements IExample {

	public void run() {
		float f;

		Scanner scanner = new Scanner(System.in, "UTF-8");

		f = scanner.nextFloat();

		System.out.println(String.format("%.6f", f));
	}

}
