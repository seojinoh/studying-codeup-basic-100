package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example77 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int input = scanner.nextInt();

		for(int i = 0; i < input + 1; i++) {
			System.out.println(i);
		}
	}

}
