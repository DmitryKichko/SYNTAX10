package com.syntax.class10;

public class AnotherTask {

	public static void main(String[] args) {
		
		/*
		 * Создайте массив стран. 
		 * При извлечении всех значений из массива выведите капитал для каждой страны. 
		 * (используйте 2 разных цикла)
		 */
	
		String[] countries={"Авганистан", "Таджикистан", "США", "Япония"};
		
		 String capital = "";
		 
		 for(String country:countries) {
			
			
			 
			if(country.equals("Таджикистан")) {
				 capital="Кабул";
			 }else if  (country.equals("Таджикистан")) {
				 capital="Душанбе";
			 
			 }else if(country.equals("США")) {
				 capital="Вашингтон";
			 }else if(country.equals("Япония")) {
				 capital="Токио";
			 }
			 System.out.println("Страна " + country + " это " + capital);
		 }

		capital = "";
		 
		 for (int i = 0; i<countries.length; i++) {
			 
			 switch(countries[i]) {
			 
			 case "Авганистан":
				 capital="Кабул";
				 break;
			 case "Таджикистан":
				 capital="Душанбе";
				 break; 
			 case "США":
				 capital="DC";
				 break;
			 case "Япония":
				 capital="Токио";
				 break;
				 
			 }
System.out.println("Страна " + countries[i] + " это " + capital);
			 
		 }
		 
		 
	}

}
