package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example31 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int input = scanner.nextInt();

		System.out.println(Integer.toOctalString(input));
	}

}
