class A   // super class
{
    void show()
    {
        System.out.println("Parent class A");
    }
}

class B extends A   // sub class
{
    void show()
    {
        System.out.println("Child class B");
    }
}

class TestUpcast
{
    public static void main(String args[])
    {
        A obj = new B();   // upcasting
        obj.show();       // runtime polymorphism
    }
}