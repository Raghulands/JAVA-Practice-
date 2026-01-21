//inheritance Animal Kingdom
class Zoo
{
    void ZooAnimals()
    {
        System.out.println("LION.TIGER.PANDA");
    }
}
class Lion extends Zoo
{
    void Description()
    {
     System.out.println("A LION IS ALWAYS A LION");
    }
}
class Tiger extends Zoo
{
    void Description()
    {
        System.out.println("TIGER EATS TIGER-BISCUIT");
    }
}
class Panda extends Zoo
{
    void Description()
    {
        System.out.println("EAT<>SLEEP<>REPEAT");
    }
}
public class q44
{
    public static void main(String args[])
    {
        Lion obj=new Lion();
        obj.ZooAnimals();
        obj.Description();
        Tiger obj2=new Tiger();
        obj2.Description();
        Panda obj3=new Panda();
        obj3.Description();
    }
}
