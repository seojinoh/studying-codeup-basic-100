package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example25 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		char[] inputs = scanner.next().toCharArray();

		int n = 10000;

		for(char input : inputs) {
			System.out.println("[" + Integer.parseInt(String.valueOf(input)) * n + "]");

			n = n / 10;
		}
	}

}
