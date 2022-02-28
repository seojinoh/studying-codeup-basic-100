package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example78 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int input = scanner.nextInt();

		int sum = 0;

		for(int i = 1; i < input + 1; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}

		System.out.println(sum);
	}

}
