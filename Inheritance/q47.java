class Person
{
    String name;
    Person(String name) 
    {
        this.name = name;
    }
}
class Employee extends Person
{
    int EmployeeId;
    public Employee() 
    {
        super("Ragu");
        System.err.println(name);
    }
}
public class q47 
{
    public static void main(String[] args)
    {
       Employee e=new Employee();
       // System.out.println("Hello, World!");
    }
}
