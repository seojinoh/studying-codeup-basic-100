package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example79 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		while(true) {
			char input = scanner.next().charAt(0);

			System.out.println(input);

			if(input == 'q') {
				break;
			}
		}
	}

}
