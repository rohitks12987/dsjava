class Wx
{
    void div(int x,int y)
    {
        System.out.println("Division:"+(x/y));
    }
    public static void main(String s[])
    {
        Wx w=new Wx();
        try
        {
            w.div(5,0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division error are occured");
            System.out.println("Rohit Kumar");
        }

    }
}