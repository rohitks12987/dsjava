//Method Overloading
class Test
{
    void product(int x,int y)
    {
        System.out.println("Product 2 Args:"+x*y);
    }
    void product(int x,int y,int z)
    {
        System.out.println("Product 3 Args:"+x*y*z);
    }  
}
class MethodOverloadEx1
{
    public static void main(String args[])
    {
        Test obj=new Test();
        obj.product(10,20);
        obj.product(10,20,30);
    }
}