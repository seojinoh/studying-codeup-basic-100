package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example12 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		float f = scanner.nextFloat();

		System.out.println(String.format("%.6f", f));
	}

}
