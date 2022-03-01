package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example87 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int input = scanner.nextInt();

		int sum = 0;

		for(int i = 1; i < input; i++) {
			sum += i;

			if(sum >= input) {
				System.out.println(sum);

				break;
			}
		}
	}

}
