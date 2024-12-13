import java.util.*;
public class printingSET {
    public static void main(String args[])
    {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("hello");
        a.add("Students");
        a.add("hey");
        a.add("raj");
        //iterator
        for(String s:a)
        {
            System.out.println(s+" ");
        }


    }
    
}
