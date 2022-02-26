package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example46 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		int sum = a + b + c;
		float average = (float) (sum / 3);

		System.out.println(sum);
		System.out.println(String.format("%.1f", average));
	}

}
