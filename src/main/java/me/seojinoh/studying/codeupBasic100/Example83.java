package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example83 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int input = scanner.nextInt();

		String output = "";

		for(int i = 1; i < input + 1; i++) {
			if(i % 3 == 0) {
				output += "X ";
			} else {
				output += i + " ";
			}
		}

		System.out.println(output);
	}

}
