package com.syntax.class07;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		
		/*
		 * С помощью сканера класса создать калькулятор. Разрешить
		 * пользователю вводить 2 числа и оператор (+,-,*,/).
		 * На основе оператора выдавать пользователю результат.
		 * Выполните это задание двумя способами:
		 * используя оператор switch case.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Пожалуйста, введите два разных числа");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result; 
		System.out.println("Пожалуйста, введите оператора");
		String operator = scan.next();

		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		default:
			result = 0;
		}


			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		}
	
}
