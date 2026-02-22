class parent {
    String name;
    void disp() {
        name = "Rohit Kumar";
        System.out.println("Name is " + name);
    }
}
class child extends parent {
    int rollno;
    void show() {
        rollno = 543;
        System.out.println("The roll number is " + rollno);
    }
}
public class simple_inheritance {
    public static void main(String[] args) {
        parent p = new parent();
        p.disp();
        child c = new child();
        c.show();
        c.disp();
    }
}