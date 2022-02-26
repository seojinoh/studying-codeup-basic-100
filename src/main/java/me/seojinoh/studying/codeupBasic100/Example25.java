package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example25 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		String[] inputs = scanner.next().split("", 5);

		int n = 10000;

		for(String input : inputs) {
			System.out.println("[" + Integer.parseInt(input) * n + "]");

			n = n / 10;
		}
	}

}
