package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example76 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		char input = scanner.next().toCharArray()[0];

		int start = (int) 'a';
		int end = (int) input;

		for(int i = start; i < end + 1; i++) {
			System.out.println((char) i);
		}
	}

}
