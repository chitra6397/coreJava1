package udemyJavaProgrammingBeginner;

public class MyChar {
    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public boolean isVowel() {
        // 'a' e i o u ou A E I O U
        if (ch == 'a')
            return true;
        if (ch == 'e')
            return true;
        if (ch == 'i')
            return true;
        if (ch == 'o')
            return true;
        if (ch == 'u')
            return true;
        return false;
    }

    public boolean isDigit() {
        if (ch >= 48 && ch <= 57)
            return true;

        return false;
    }
    public boolean isAlphabet(){
        if (ch>= 97 && ch <=122)
            return true;
        if (ch>= 65 && ch <=90)
            return true;
        return false;
    }
    public boolean isConsonant(){
        if (isAlphabet() && !isVowel())
            return true;
        return false;
    }public static void printLowerCaseAlphabet(){
        for(char ch ='a'; ch <='z';ch++){
            System.out.println(ch);
        }
    }
    public static void printlnUpperCaseAlphabets(){
        for (char ch = 'A'; ch <= 'Z'; ch++){
            System.out.println(ch);
        }
    }

}


