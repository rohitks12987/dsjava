class Parent
{
    Parent()
    {
        System.out.println("Parent class Constructor");
    }
}

class Child extends Parent
{
    Child()
    {
        System.out.println("Child class Constructor");
    }
}

public class TestInheritance
{
    public static void main(String[] args)
    {
        new Child();
    }
}