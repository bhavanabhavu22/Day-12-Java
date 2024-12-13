import java.util.*;
public class Linked_list
{
    public static void main(String args[])
    {
        LinkedList<String> a=new LinkedList<>();
        a.add("hello");
        a.add("i am");
        a.add("students");
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        a.clear();
        System.out.println(a);


    }    
}
