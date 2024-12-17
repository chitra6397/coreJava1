package com.corejava.conditions;

public class ContinueStatement {
    public static void main(String[]args){
        for(int i=0;i<=2;i++){
            for(int j=0;j<=5; j++){
                if(j==4){
                    continue;
                }
                System.out.println(j);
            }
        }
    }
}
