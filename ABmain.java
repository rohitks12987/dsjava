class Bank
{
    void ROI()
    {
        System.out.println("Raise of interest");
    }
}
class SBI extends Bank
{
    void ROI()
    {
        System.out.println("SBI Bank gives 7.5 interest");
    }
}
class AXIS extends Bank
{
    void ROI()
    {
        System.out.println("AXIS Bank gives 8.5 interest");
    }
}
class  ABmain
{
     public static void main(String[] args) 
    {
        Bank b;
        b=new SBI();
        b.ROI();
        b=new AXIS();
        b.ROI();
     }
}