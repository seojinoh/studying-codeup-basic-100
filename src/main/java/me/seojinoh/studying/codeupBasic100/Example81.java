package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example81 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		String[] inputs = scanner.nextLine().split("\\s", 2);

		int n = Integer.parseInt(inputs[0]);
		int m = Integer.parseInt(inputs[1]);

		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < m + 1; j++) {
				System.out.println(i + " " + j);
			}
		}
	}

}
