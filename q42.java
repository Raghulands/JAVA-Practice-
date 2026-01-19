//Hybrid
class Animal2
{
    void eat()
    {
        System.out.println("ANIMAL HUNTS");
    }
}
class Dogs extends Animal2
{
    void Bark()
    {
        System.out.println("DOG BARKS");
    }
}
class Puppy extends Dogs
{
    void weeps()
    {
        System.out.println("Puppy Weeps");
    }
}
public class q42
{
    public static void main(String agrs [])
    {
        Puppy obj=new Puppy();
        obj.eat();
        obj.Bark();
        obj.weeps();
    }
}
