package me.seojinoh.studying.codeupBasic100;

import java.lang.reflect.Method;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeupBasic100Application {

	public static void main(String[] args) {
		System.out.println("****************************************");
		System.out.println("\nCodeUp의 기초 100제를 Java로 공부하기 위한 프로젝트");
		System.out.println("\n****************************************");

		runApplication();
	}

	private static void runApplication() {
		String exampleNumber = "";

		while(true) {
			try {
				System.out.println("\n예제 번호(01-99)를 입력하세요.");

				Scanner scanner = new Scanner(System.in, "UTF-8");
				exampleNumber = scanner.nextLine();

				runExample(exampleNumber);
			} catch (Exception e) {
				System.err.println("\n" + exampleNumber + "번 예제 실행 중 에러가 발생했습니다.\n" + e.getMessage());
			}
		}
	}

	private static void runExample(String exampleNumber) throws Exception {
		String example = "";

		try {
			example = getExample(exampleNumber);

			Class exampleClass = Class.forName(example);
			Object exampleInstance = exampleClass.newInstance();

			Class params[] = {};
			Method exampleMethod = exampleClass.getMethod("run", params);

			System.out.println("\n" + exampleNumber + "번 예제를 시작합니다.");

			exampleMethod.invoke(exampleInstance, null);
		} catch (Exception e) {
			throw new Exception(example.equals(e.getMessage()) ? exampleNumber : e.getMessage());
		}
	}

	private static String getExample(String exampleNumber) throws Exception {
		return "me.seojinoh.studying.codeupBasic100.Example" + exampleNumber;
	}

}
