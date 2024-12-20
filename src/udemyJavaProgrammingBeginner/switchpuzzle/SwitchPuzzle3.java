package udemyJavaProgrammingBeginner.switchpuzzle;

public class SwitchPuzzle3 {
    public static void main(String[]args){
        puzzle3();
    }
    private static void puzzle3(){
        int  number = 1;
        switch (number){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("Default");
                break;
        }

    }
}
