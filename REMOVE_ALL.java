
import java.util.*;
public class REMOVE_ALL {
    public static void main(String args[])
    {
        int arr1[]={22,33,44,55,66,1,2,3};
        int arr2[]={22,33,4,1,2,23};
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        for(int s:arr1)
        a.add(s);
        for(int s1:arr2)
        b.add(s1);
        
        System.out.println(a);
        System.out.println(b);
        Set<Integer> u=new HashSet<>();
        u.removeAll(b);
        System.out.println(u);
    }
}
