package udemyJavaProgrammingBeginner.switchpuzzle;

public class SwitchPuzzle2 {
    public static void main(String[]args){
        puzzle2();
    }
    private static void puzzle2(){
        int number =2;
        switch (number){
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            default:
                System.out.println("Default");
        }
    }
}
