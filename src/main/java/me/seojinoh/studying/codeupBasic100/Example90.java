package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example90 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		String[] inputs = scanner.nextLine().split("\\s", 3);

		int a = Integer.parseInt(inputs[0]);
		int r = Integer.parseInt(inputs[1]);
		int n = Integer.parseInt(inputs[2]);

		int count = 1;
		int multiplied = a;

		while(true) {
			if(count == n) {
				System.out.println(multiplied);

				break;
			}

			count++;
			multiplied *= r;
		}
	}

}
