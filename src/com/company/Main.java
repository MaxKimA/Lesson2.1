package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(number(generateRandomAge(),34));
        System.out.println(number(33,14));
        System.out.println(number(12,27));
        System.out.println(number(56,7));
        System.out.println(number(34,-20));



    }
    public static String number(int agePerson,int temperature){

        if(agePerson >= 20 && agePerson <= 45 && temperature >= -20 && temperature <= 30 ){
            return ("Можно идти гулять");
        }else if (agePerson <= 20 && temperature >= 0 && temperature <= 28){
            return ("Можно идти гулять");
        }else  if (agePerson >= 45 && temperature >= -10 && temperature <= 25){
            return "Можно идти гулять";
        }else{
            return ("Оставайтесь дома");
        }

    }
    public static  int generateRandomAge(){
        Random random = new Random();
        int age = random.nextInt(100);
        return age;
    }
}
    

