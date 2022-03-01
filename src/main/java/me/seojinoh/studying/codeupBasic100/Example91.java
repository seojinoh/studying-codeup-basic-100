package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example91 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		String[] inputs = scanner.nextLine().split("\\s", 4);

		int a = Integer.parseInt(inputs[0]);
		int m = Integer.parseInt(inputs[1]);
		int d = Integer.parseInt(inputs[2]);
		int n = Integer.parseInt(inputs[3]);

		int count = 1;
		int value = a;

		while(true) {
			if(count == n) {
				System.out.println(value);

				break;
			}

			count++;
			value = value * m + d;
		}
	}

}
