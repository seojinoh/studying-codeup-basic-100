package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example80 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int input = scanner.nextInt();

		int index = 1;
		int sum = 0;

		while(true) {
			sum += index;

			if(sum >= input) {
				System.out.println(index);

				break;
			}

			index++;
		}
	}

}
