public class this1
{
    int instVar;
    this1(int instVar)
    {
        this.instVar=instVar;
    }
    void display()
    {
        System.out.println("Value of instance variable is"+ instVar);
        System.out.println("Current object is"+ this);
    }
    public static void main(String[] args)
    {
        this1 obj=new this1(8);
        obj.display();
        System.out.println("object reference="+obj);
        this1 obj1=new this1(10);
        obj1.display();
        System.out.println("object reference="+obj1);
    }
}