package com.corejava;

public  class Base {
    public static void main(String[] args) {
        Parent parent= new Parent();
        parent.print1();
        parent.print2();
        parent.print1();

    }
}
 class Base1
{
    public  void  print1(){
        System.out.println("good");
    }
}
class  Parent extends  Base1{
    public  void  print2(){
        System.out.println("evening");

    }

}

