package com.syntax.class04;

public class Task_1 {
	public static void main(String[] args) {

/*
 *  Напишите программу, хранящую булево значение 0 наличии или отсутствии у пользователя диплома. 
 * Если у пользователя есть диплом, то следует поздравить его, в противном случае программа должна предложить ему получить ученую степень. 
 * Затем, если у пользователя есть диплом, программа должна проверить балл gpa. 
 * Если балл gpa больше или равен 3.5 → в выводе должно быть написано 
 * "Вы имеете право на получение стипендии", в противном случае → "Вам следовало учиться усерднее". 
 */
		
		boolean diploma=true;
		double score=3.0;
		
		if (diploma) {
			System.out.println(" Поздравляем");
		
			if (score >=3.5) {
				System.out.println(" Вы имеете право на получение стипендии");
			} else {
				System.out.println("Надо было учиться лучше");
			}
			
			
			
		} else {
			System.out.println(" Получить высшее образование");
			
		
		
		}
		
	}
}
