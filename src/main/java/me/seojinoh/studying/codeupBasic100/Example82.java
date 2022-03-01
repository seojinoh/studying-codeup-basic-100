package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example82 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int input = scanner.nextInt(16);

		for(int i = 1; i < 16; i++) {
			System.out.println(String.format("%X*%X=%X", input, i, input * i));
		}
	}

}
