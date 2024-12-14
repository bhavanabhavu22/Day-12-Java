import java.util.*;
public class CONTAINSkeyword {
    
    public static void main(String args[])
    {
        HashMap<String,String> a=new HashMap<>();
        a.put("SNo","02");
        a.put("sname","bhavana");
        System.out.println(a);
        //printing has map key value
        if(a.ContainsKey("sname"));
        {
            String d=a.get("sname");
            System.out.println(d);

        }
    }
}

