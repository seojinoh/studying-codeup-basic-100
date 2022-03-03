package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example24 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		char[] inputs = scanner.next().toCharArray();

		for(char input : inputs) {
			System.out.println("'" + input + "'");
		}
	}

}
