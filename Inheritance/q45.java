//inheritance
class Vehicle
{
    String Brand;
    int Year;
    void StartEngine()
    {
        System.out.println(Brand+","+Year);
        System.out.println("ENGINE STARTS");
    }
}
class Car extends Vehicle
{
    String FuelType;
    void StartEngine()
    {
        System.out.println("Car Engine Starts");
    }
    void Drive()
    {
        System.out.println("Car is Driving");
    }
}
class Truck extends Vehicle
{
    int loadCapacity;
    void StartEngine()
    {
        System.out.println("Truck Engine Starts");
    }
    void haul()
    {
        System.out.println("Truck is hauling ");
    }
}
public class q45
{
    public static void main(String args[])
    {
        Vehicle obj=new Vehicle();
        obj.Brand="BMW";
        obj.Year=1985;
        obj.StartEngine();
        Car obbj=new Car();
        obbj.StartEngine();
        obbj.Drive();
        Truck obbbj=new Truck();
        obbbj.StartEngine();
        obbbj.haul();
    }
}
