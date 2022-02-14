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
		while(true) {
			try {
				System.out.println("\n예제 번호를 입력해 주세요. (01 ~ 99)");

				Scanner scanner = new Scanner(System.in, "UTF-8");
				String exampleNumber = scanner.nextLine();

				runExample(getExample(exampleNumber));
			} catch (Exception e) {
				System.out.println(String.format("\n%s ::: %s", "예외가 발생하였습니다.", e.getMessage()));
			}
		}
	}

	private static String getExample(String exampleNumber) throws Exception {
		return "me.seojinoh.studying.codeupBasic100.example" + exampleNumber;
	}

	private static void runExample(String example) throws Exception {
		try {
			Class exampleClass = Class.forName(example);
			Object exampleInstance = exampleClass.newInstance();

			Class params[] = {};
			Method exampleMethod = exampleClass.getMethod("run", params);

			System.out.println(String.format("\n%s ::: %s", "예제를 시작합니다.", example));

			exampleMethod.invoke(exampleInstance, null);
		} catch (Exception e) {
			throw new Exception(example.equals(e.getMessage()) ? example : e.getMessage());
		}
	}

}
