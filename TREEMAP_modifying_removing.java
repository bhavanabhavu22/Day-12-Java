import java.util.*;
public class TREEMAP_modifying_removing {
    public static void main(String args[])
    {
        HashMap<String,String> a=new HashMap<>();
        a.put("SNO","01");
        a.put("sname","bavana");
        a.put("city","chennai");
        System.out.println(a);
        //modying value
        a.put("SNo","90");
        System.out.println(a);
        //removing key
        a.remove("sname");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}
