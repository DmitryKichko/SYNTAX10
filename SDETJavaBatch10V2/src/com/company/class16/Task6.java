package com.company.class16;

public class Task6 {
    public static void main(String[] args) {
        // 7. How would you swap 2 strings without a temporary variable?
        // 7. Как бы вы поменяли местами 2 строки без временной переменной?
        String str="String one";
        String str2="String two";
        str=str+str2; // String oneString two (Строка один Строка два)
        str2=str.substring(0,str.length()-str2.length());
        str=str.substring(str2.length());
        System.out.println(str);
        System.out.println(str2);
    }




}
