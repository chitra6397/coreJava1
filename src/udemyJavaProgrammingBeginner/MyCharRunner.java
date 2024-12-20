package udemyJavaProgrammingBeginner;

public class MyCharRunner {
    public static void main(String[]args){
        MyChar myChar =new MyChar('6');
        System.out.println(myChar.isVowel());

        System.out.println(myChar.isVowel());
        System.out.println(myChar.isDigit());
        System.out.println(myChar.isAlphabet());

        System.out.println(myChar.isConsonant());
        MyChar.printLowerCaseAlphabet();
        MyChar.printlnUpperCaseAlphabets();

    }
}
