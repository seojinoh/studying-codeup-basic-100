package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example67 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int input = scanner.nextInt();

		if(input >= 0) {
			System.out.println("plus");
		} else {
			System.out.println("minus");
		}

		if(input % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

}
