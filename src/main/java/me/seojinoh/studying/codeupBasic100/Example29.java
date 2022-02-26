package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example29 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		double input = scanner.nextDouble();

		System.out.println(String.format("%.11f", input));
	}

}
