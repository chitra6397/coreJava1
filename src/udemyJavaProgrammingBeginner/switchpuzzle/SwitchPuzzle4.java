package udemyJavaProgrammingBeginner.switchpuzzle;

public class SwitchPuzzle4 {
    public static void main(String[]args){
        puzzle4();
    }
    private static void puzzle4(){
        int number =10;
        switch (number){
            default:
                System.out.println("Default");
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
        }
    }
}
