package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example99 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int[][] positions = new int[10][10];

		for(int x = 0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				positions[x][y] = scanner.nextInt();
			}
		}

		positions[1][1] = 9;
		boolean isFinished = false;

		for(int x = 1; x < 10; x++) {
			for(int y = 1; y < 10; y++) {
				if(positions[x][y - 1] == 9) {
					if(positions[x][y] == 2) {
						positions[x][y] = 9;

						isFinished = true;
					} else if(positions[x][y] == 0) {
						positions[x][y] = 9;
					}
				} else if(positions[x - 1][y] == 9 && positions[x - 1][y + 1] != 9) {
					if(positions[x][y] == 2) {
						positions[x][y] = 9;

						isFinished = true;
					} else if(positions[x][y] == 0) {
						positions[x][y] = 9;
					}
				}

				if(isFinished) {
					break;
				}
			}

			if(isFinished) {
				break;
			}
		}

		for(int x = 0; x < 10; x++) {
			String output = "";

			for(int y = 0; y < 10; y++) {
				output += positions[x][y] + " ";
			}

			System.out.println(output);
		}
	}

}
