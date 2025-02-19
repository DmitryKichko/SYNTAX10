package com.collection.class27.encapsulationdemo1;

public class BankAccount {
    private String name;
   private double balance;
   private String userName;
   private String password;

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void setName(String name){
       if (name.length()>50){
           System.out.println("Пожалуйста, сократите длину названия");
       }else if(name.replaceAll("[^A-Za-z]","").length()!=name.length()){
           System.out.println("Специальные символы и цифры в имени не допускаются");
       }else {
           this.name=name;
       }
   }

   double getBalance(String password){
       if(this.password.equals(password)){
           return balance;
       }else {
           return -1;
       }
   }
}
