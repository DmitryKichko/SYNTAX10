package com.syntax.class04;

import java.util.Scanner;

public class AnotherScanner {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		//давайте зафиксируем имя и фамилию
		System.out.println("Пожалуйста, введите ваше имя");
		String name=scan.nextLine();
		
		System.out.println("Пожалуйста, введите Вашу фамилию");
		String lastName=scan.nextLine();
		
		System.out.println("Пожалуйста, скажите мне страну, откуда вы родом");
		String country=scan.nextLine();
		
		System.out.println("Приятно познакомиться "+name+" "+lastName+" из "+country);
		/*
		 *  next() - используется для захвата значения String перед пробелом
		 *  nextLine() - используется для захвата значения String (полная строка, включая пробелы)
		 */
		
	}

}
