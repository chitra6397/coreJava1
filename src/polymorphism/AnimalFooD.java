package polymorphism;

public class AnimalFooD {
    void eat(){System.out.println("Eating");}
}
class Dog extends AnimalFooD {
    void eat(){System.out.println("Eating Bread...");}
}
class cat extends AnimalFooD{
    void eat(){System.out.println("Eating rat...");}
}
class lion extends AnimalFooD{
    void eat(){System.out.println("Eating Meat...");}
}
class goat extends AnimalFooD {
    void eat() {
            System.out.println("Eating Grass...");
        }
    }
class TestPolymorphism3{
    public static void main(String[] args) {
        AnimalFooD a;
        a= new Dog();
        a.eat();
        a=new cat();
        a.eat();
        a= new lion();
        a.eat();
        a=new goat();
        a.eat();
    }
}
