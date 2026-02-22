//Method Overloading
class MethodOverload
{
    void name_rno(int roll_no,String name)
    {
        System.out.println("roll number is"+roll_no);
        System.out.println("name is"+name);
    }
    void name_rno(String name,int roll_no)
    {
        System.out.println("Name is"+ name);
        System.out.println("Roll number is"+ roll_no);
    }  
}
public class MethodOverloadEx3
{
    public static void main(String[] args)
    {
        MethodOverload obj = new MethodOverload();
        obj.name_rno(543, "Rohit Kumar");
        obj.name_rno( "Rohit Kumar",543);
    }
}