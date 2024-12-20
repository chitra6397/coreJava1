package udemyJavaProgrammingBeginner.switchexercises;

public class SwitchExercisesRunner {
    public static void main(String[]args){
        System.out.println(determineNameOfDay(1));
    }
    public static String determineNameOfDay(int dayName){
        String result= "";
        switch (dayName){
            case 0:
                result = "Sunday";
            case 1:
                result ="Monday";
            case 2:
                result ="Tuesday";
            case 3:
                result ="Wednesday";
            case 4:
                result = "Thursday";
            case 5:
                result = "Friday";
            case 6:
                result ="Saturday";
        }
        return result;
    }
}
