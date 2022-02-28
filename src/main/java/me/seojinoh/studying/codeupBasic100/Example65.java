package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example65 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		String[] inputs = scanner.nextLine().split("\\s", 3);

		for(String input : inputs) {
			if(Integer.parseInt(input) % 2 == 0) {
				System.out.println(input);
			}
		}
	}

}
