package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example98 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int h = scanner.nextInt();
		int w = scanner.nextInt();
		int n = scanner.nextInt();

		int[][] positions = new int[h][w];

		for(int i = 0; i < n; i++) {
			int l = scanner.nextInt();
			int d = scanner.nextInt();
			int a = scanner.nextInt() - 1;
			int b = scanner.nextInt() - 1;

			for(int x = 0; x < h; x++) {
				for(int y = 0; y < w; y++) {
					if(d == 0) {
						if(x == a && y >= b && y < b + l) {
							positions[x][y] = 1;
						}
					} else {
						if(y == b && x >= a && x < a + l) {
							positions[x][y] = 1;
						}
					}
				}
			}
		}

		for(int x = 0; x < h; x++) {
			String output = "";

			for(int y = 0; y < w; y++) {
				output += positions[x][y] + " ";
			}

			System.out.println(output);
		}
	}

}
