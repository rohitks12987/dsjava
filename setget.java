public class setget
{
    private int rno;
    private String name;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setRno(int rno)
    {
        this.rno = rno;
    }

    public int getRno()
    {
        return rno;
    }

    public void display()
    {
        System.out.println("Name is: " + name);
        System.out.println("Roll No is: " + rno);
    }

    public static void main(String[] args)
    {
        setget obj = new setget();   // object creation

        obj.setName("Rohit");
        obj.setRno(101);

        obj.display();
    }
}