import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class IteratorExample
{
    public static void main(String[] args)
    {
        List<String>colors=new ArrayList<>();
        colors.add("Violet");
        colors.add("Indigo");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Red");

        Iterator<String> iter=colors.iterator();
        while(iter.hasNext())
        {
            String c=iter.next();
            System.out.println(c);
        }
    }
}