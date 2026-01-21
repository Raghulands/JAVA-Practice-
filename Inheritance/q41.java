//Single
class Animal
{
    void eat()
    {
        System.out.println("Animal Hunts");
    }
}
class Dog extends Animal
        {
            void bark()
            {
                System.out.println("Dog Barks");
            }
        }
public class q41
{
    public static void main(String agrs [])
    {
        Dog obj=new Dog();
        obj.bark();
    }
}
