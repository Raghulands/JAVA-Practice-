class Animal4
{
    Animal4(int x)
    {

        System.out.println("Animal3 Constructor");
    }
}
class Dog4 extends Animal4
{
    Dog4()
    {
        super(10);
        System.out.println("Dog3 Constructor");
    }
}
public class q46 
{
    public static void main(String[] args) {
        Dog4 d=new Dog4();  
    }
}
