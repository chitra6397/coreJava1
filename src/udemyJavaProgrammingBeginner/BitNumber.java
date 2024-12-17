package udemyJavaProgrammingBeginner;

public class BitNumber {
    private int number1;
    private int number2;

    public BitNumber(int number1,int number2){
        this.number1 = number1;
        this.number2 = number2;

    }
    public int add(){
        int sum =number1+ number2;
        System.out.println(number1+number2);
        return 0;
    }
    public int multiple(){
        System.out.println(number1*number2);
        return 0;
    }

    }

