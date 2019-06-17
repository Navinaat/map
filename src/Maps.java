
import java.util.*;
public class Maps
{
    public static void main(String[] args)
    {
        Map m1=new HashMap();
        m1.put("1","navi");
        m1.put(2,"rajee");
        m1.put(3,"thamizh");
        m1.put(4,"kishore");
        m1.put("null","null");

        System.out.println(m1.containsValue("navi"));
        System.out.println(m1.containsKey(3));
        System.out.println(m1.containsValue("nav"));
        System.out.println(m1.remove("navi"));
        System.out.println("mERGE SUCCESSFULLY");
        System.out.println(m1.entrySet());
        System.out.println(m1.get(10));
        System.out.println(m1.keySet());


    }
}
