package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example68 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int input = scanner.nextInt();

		if(input >= 90) {
			System.out.println("A");
		} else if(input >= 70) {
			System.out.println("B");
		} else if(input >= 40) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}

}
