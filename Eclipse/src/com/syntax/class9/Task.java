package com.syntax.class9;

public class Task {

	public static void main(String[] args) {
		
		/*
		 * Создайте массив символов и занесите в него оценки: A,B,C,D,E,F.
		 * Затем вывести оценку B
		 */
		
		/*
		 * Создайте массив names и сохраните в нем все имена вашей группы.
		 * Затем выведите свое имя из этого массива.
		 */
		
		String[] syntaxfc = new String [8];
		syntaxfc[0]= "Jose";
		syntaxfc[1]= "Sule";
		syntaxfc[2]= "Blake";
		syntaxfc[3]= "Ana";
		syntaxfc[4]= "Enes";
		syntaxfc[5]= "Andrei";
		syntaxfc[6]= "Burju";
		syntaxfc[7]= "Gurkan";
		
		System.out.println(syntaxfc[0]);
		int size=syntaxfc.length;
		System.out.println(size);
		
		// declaration and storing values must be completed right away
		String[] names = {"Jose", "Sule", "Blake", "Ana", "Enes", "Andrei", "Burju","Gurkan"};
		System.out.println(names[6]);	
		
		System.out.println(names.length);
		
		names[6]="Francisko";
		//System.out.println(names[8]); ArrayIndexOutOfBoundsException 
		// (Исключение, связанное с выходом индекса массива за пределы границ)
		
		int[] num;
		num=new int[2];
		num[0]=1;
		num[1]=10;
		
		
		int[] n;
		//n={10,20}; невозможно добавить значения таким образом после объявления
		
		int[] array = {10, 20, 30, 40, 50};
		
		// Task
		
		/*
		 * Создать массив слов: Java, Saturday, day, coding, is.
		 * Выведите следующее предложение, используя элементы массива: "Суббота - день кодирования Java".
		 */
		
	
		
	}
}
