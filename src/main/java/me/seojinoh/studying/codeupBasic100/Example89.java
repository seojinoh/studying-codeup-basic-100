package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example89 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		String[] inputs = scanner.nextLine().split("\\s", 3);

		int a = Integer.parseInt(inputs[0]);
		int d = Integer.parseInt(inputs[1]);
		int n = Integer.parseInt(inputs[2]);

		int count = 1;
		int sum = a;

		while(true) {
			if(count == n) {
				System.out.println(sum);

				break;
			}

			count++;
			sum += d;
		}
	}

}
