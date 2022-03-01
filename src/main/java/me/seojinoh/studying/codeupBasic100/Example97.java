package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example97 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int[][] positions = new int[19][19];

		for(int x = 0; x < 19; x++) {
			for(int y = 0; y < 19; y++) {
				positions[x][y] = scanner.nextInt();
			}
		}

		int count = scanner.nextInt();

		for(int i = 0; i < count; i++) {
			int a = scanner.nextInt() - 1;
			int b = scanner.nextInt() - 1;

			for(int x = 0; x < 19; x++) {
				for(int y = 0; y < 19; y++) {
					if(x == a) {
						if(positions[x][y] == 0) {
							positions[x][y] = 1;
						} else {
							positions[x][y] = 0;
						}
					}

					if(y == b) {
						if(positions[x][y] == 0) {
							positions[x][y] = 1;
						} else {
							positions[x][y] = 0;
						}
					}
				}
			}
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
