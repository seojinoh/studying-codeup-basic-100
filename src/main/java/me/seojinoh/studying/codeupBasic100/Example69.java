package me.seojinoh.studying.codeupBasic100;

import java.util.Scanner;

public class Example69 implements IExample {

	public void run() {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		char input = scanner.next().toCharArray()[0];

		switch(input) {
		case 'A':
			System.out.println("best!!!");
			break;
		case 'B':
			System.out.println("good!!!");
			break;
		case 'C':
			System.out.println("run!");
			break;
		case 'D':
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
			break;
		}
	}

}
