package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example71 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		while(true) {
			int input = scanner.nextInt();

			if(input == 0) {
				break;
			}

			System.out.println(input);
		}
	}

}
