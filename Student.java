public class Student
{
    Student()
    {
        System.out.println("This is student constructor");
    }
    void display()
    {
        System.out.println("This is the display method");

    }
    public static void main(String[] s)
    {
        Student var1=new Student();
        var1.display();
    }
}