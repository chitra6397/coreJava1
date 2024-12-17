package com.corejava.conditions;
public class StudentCity {
    public static void main (String []args){
        String address ="Delhi ,india";


        if(address.endsWith("India")) {
            if(address.contains("Meerut")){
                System.out.println("Your city is meerut");
            }
            else if (address.contains("Noida")){
                System.out.println("Your city is Noida");
            }
            else {
                System.out.println(address.split(",")[0]);
            }
        }
        else {
            System.out.println("You are not living in india");
        }

    }
}
