//Hierarchical
class Animal3
{
    void eat()
    {
        System.out.println("ANIMAL HUNTS");
    }
}
class Dog3 extends Animal3
{
    void Bark()
    {
        System.out.println("DOG BARKS");
    }
}
class Cat extends Animal3
{
    void Drink()
    {
        System.out.println("CAT DRINKS MILK");
    }
}
public class q43
{
    public static void main(String agrs [])
    {
        Cat obj=new Cat();
        obj.eat();
        //obj.Bark();
        obj.Drink();
        Dog obj1=new Dog();
        obj1.bark();
    }
}
