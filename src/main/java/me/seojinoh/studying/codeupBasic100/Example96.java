package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example96 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int count = scanner.nextInt();

		int positions[][] = new int[19][19];

		for(int i = 0; i < count; i++) {
			int x = scanner.nextInt() - 1;
			int y = scanner.nextInt() - 1;

			positions[x][y]++;
		}

		for(int x = 0; x < 19; x++) {
			String output = "";

			for(int y = 0; y < 19; y++) {
				output += positions[x][y] + " ";
			}

			System.out.println(output);
		}
	}

}
