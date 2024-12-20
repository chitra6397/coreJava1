package udemyJavaProgrammingBeginner;

import java.util.Scanner;

public class Student {

    private int marks;
    public Student(int marks){
        this.marks =marks;
    }
    public char assignGrade(){
        if(marks>=100 ||marks<0){
            System.out.println("dchgdcghgd");
            return 'x';
        }
        if(marks>=90){
            System.out.println("A");
            return 'A';
        }
        if (marks>=80){
            System.out.println("B");
            return 'B';
        }
        if (marks>=70){
            System.out.println("C");
            return 'C';
        }
        if (marks>=60){
            System.out.println("D");
            return 'D';
        }
        if(marks>=50){
            System.out.println("Grade E");
        }
        return 'F';

    }

}
class  App{
    public static void main(String[] args) {
        Student student= new Student(100);
        student.assignGrade();

    }
}
