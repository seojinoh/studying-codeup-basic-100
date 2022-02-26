package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example27 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		String[] inputs = scanner.next().split("\\.", 3);

		String y = String.format("%04d", Integer.parseInt(inputs[0]));
		String m = String.format("%02d", Integer.parseInt(inputs[1]));
		String d = String.format("%02d", Integer.parseInt(inputs[2]));

		System.out.println(d + "-" + m + "-" + y);
	}

}
